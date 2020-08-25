package jul.nifares.MedievalApp.domain;

import jul.nifares.MedievalApp.domain.repository.InMemoryKnightRepository;
import jul.nifares.MedievalApp.domain.repository.KnightRepository;
import jul.nifares.MedievalApp.domain.repository.QuestRepository;
import jul.nifares.MedievalApp.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;


    @Override
    public void run(String...args) throws Exception{


//        questRepository.createRandomQuest();
//        questRepository.createRandomQuest();
//        System.out.println(knightRepository);
//        questService.assignRandomQuest("Lancelot");
//        questService.assignRandomQuest("Percival");





    }
}
