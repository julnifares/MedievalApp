package jul.nifares.MedievalApp.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "jul.nifares.MedievalApp")
@EnableScheduling
public class MedievalAppApplication {

	public static void main(String[] args) {
	SpringApplication.run(MedievalAppApplication.class, args);


	}

}
