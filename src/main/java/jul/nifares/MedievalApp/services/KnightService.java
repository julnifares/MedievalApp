package jul.nifares.MedievalApp.services;

import jul.nifares.MedievalApp.domain.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jul.nifares.MedievalApp.domain.repository.KnightRepository;

import java.util.ArrayList;
import java.util.List;



@Component
public class KnightService {

    @Autowired
    KnightRepository knightRepository;


    public List<Knight> getAllKnights(){
        return new ArrayList<>(knightRepository.getAllKnights());
    }

}


