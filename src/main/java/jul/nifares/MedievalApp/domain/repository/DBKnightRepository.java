package jul.nifares.MedievalApp.domain.repository;

import jul.nifares.MedievalApp.domain.Knight;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class DBKnightRepository implements KnightRepository{


    Map<String, Knight> knights = new HashMap<>();


    public DBKnightRepository(){
    }

    @Override
    public void createKnight(String name, int age) {
        System.out.println("Używam bazy danych");
        throw new RuntimeException();
    }

    @Override
    public Knight getKnights(String name) {
        System.out.println("Używam bazy danych");
        throw new RuntimeException();
    }

    @Override
    public void deleteKnight(String name){  System.out.println("Używam bazy danych");
    throw new RuntimeException();
    }

    @Override
    public Collection<Knight> getAllKnights(){
        throw new RuntimeException();

    }

    @Override
    @PostConstruct
    public void build(){
        System.out.println("Używam bazy danych");

    }


    @Override
    public String toString() {
        return "DBKnightRepository{" +
                "knights=" + knights +
                '}';
    }
}




