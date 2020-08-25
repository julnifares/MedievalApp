package jul.nifares.MedievalApp.domain.repository;

import jdk.jshell.spi.ExecutionControl;
import jul.nifares.MedievalApp.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;

public interface KnightRepository {
    void createKnight(String name, int age);

    Knight getKnights(String name);

    void deleteKnight(String name);

    public Collection<Knight> getAllKnights();


    void build();

   }
