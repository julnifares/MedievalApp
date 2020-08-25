package jul.nifares.MedievalApp.domain.repository;

import jul.nifares.MedievalApp.domain.Quest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    List<Quest> questList = new ArrayList<>();
    Random rand = new Random();


    public void createQuest(String description){
        questList.add(new Quest(description));
    }
    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }

    public List<Quest> getQuestList(){
        return questList;
    }

    @PostConstruct
    public void init(){
        createQuest("Uratuj księżniczkę");
        createQuest("Weź udział w turnieju");

    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuest(){
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj księżniczkę");
        descriptions.add("Zabij smoka");
        descriptions.add("Weź udział w turnieju");
        descriptions.add("Zabij bandę goblinów");

    String description = descriptions.get(rand.nextInt(descriptions.size()));
    System.out.println("Utworzono zadanie o opisie: "+ description);
    createQuest(description);
    }
    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
