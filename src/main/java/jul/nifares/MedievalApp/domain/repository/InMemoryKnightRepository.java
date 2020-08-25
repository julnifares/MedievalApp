package jul.nifares.MedievalApp.domain.repository;

import jul.nifares.MedievalApp.domain.Knight;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class InMemoryKnightRepository implements KnightRepository {



    Map<String, Knight> knights = new HashMap<>();


    public InMemoryKnightRepository(){
    }

    @Override
    public void createKnight(String name, int age) {knights.put(name, new Knight(name, age));  }

    @Override
    public Knight getKnights(String name){ return knights.get(name);    }

    @Override
    public void deleteKnight(String name){  knights.remove(name);    }

    @Override
    public Collection<Knight> getAllKnights() {
        return knights.values();
    }

    @Override
    @PostConstruct
    public void build(){
        createKnight("Lancelot", 29);
        createKnight("Percival", 25);
    }


    public String toString() {
        return "InMemoryKnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
