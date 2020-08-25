package jul.nifares.MedievalApp.services;


import jul.nifares.MedievalApp.domain.Quest;
import jul.nifares.MedievalApp.domain.repository.InMemoryKnightRepository;
import jul.nifares.MedievalApp.domain.repository.KnightRepository;
import jul.nifares.MedievalApp.domain.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand = new Random();

    public void assignRandomQuest(String knightName){

        List<Quest> allQuest = questRepository.getQuestList();
        Quest randomQuest = allQuest.get(rand.nextInt(allQuest.size()));
        knightRepository.getKnights(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);

    }


}
