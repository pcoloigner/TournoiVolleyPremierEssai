package org.pcomeziantou.tournoivolleydatabase;

import org.pcomeziantou.tournoivolleydatabase.entities.Tournoi;
import org.pcomeziantou.tournoivolleydatabase.repository.TournoiRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TournoivolleyDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TournoivolleyDatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(TournoiRepository tournoiRepository){
		return args -> {
			tournoiRepository.save(Tournoi.builder().nom("Téléthon 2023").date("09/12/2023").lieu("Gymnase Pasteur").build());
			tournoiRepository.save(Tournoi.builder().nom("Téléthon 2022").date("09/12/2022").lieu("Gymnase Pasteur").build());
			tournoiRepository.save(Tournoi.builder().nom("Téléthon 2021").date("09/12/2021").lieu("Gymnase Marcel Paul").build());
		};
	}

}
