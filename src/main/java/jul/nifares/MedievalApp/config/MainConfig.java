package jul.nifares.MedievalApp.config;


import jul.nifares.MedievalApp.domain.repository.DBKnightRepository;
import jul.nifares.MedievalApp.domain.repository.InMemoryKnightRepository;
import jul.nifares.MedievalApp.domain.repository.KnightRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class MainConfig {


    @Bean(name="inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepository(){
        KnightRepository repo = new InMemoryKnightRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    @Profile("prod")
    public KnightRepository dBRepository(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }

}
