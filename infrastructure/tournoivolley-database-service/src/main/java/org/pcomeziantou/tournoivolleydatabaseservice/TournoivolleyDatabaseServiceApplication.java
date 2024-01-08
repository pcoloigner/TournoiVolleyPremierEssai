package org.pcomeziantou.tournoivolleydatabaseservice;

import java.util.UUID;

import org.pcomeziantou.tournoivolleydatabaseservice.repository.PointRepository;
//import org.pcomeziantou.tournoivolleydatabaseservice.repository.SetRepository;
import org.pcomeziantou.tournoivolleydatabaseservice.entities.Match;
import org.pcomeziantou.tournoivolleydatabaseservice.entities.Point;
//import org.pcomeziantou.tournoivolleydatabaseservice.entities.Set;
import org.pcomeziantou.tournoivolleydatabaseservice.repository.MatchRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TournoivolleyDatabaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TournoivolleyDatabaseServiceApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(MatchRepository matchRepository
										//, SetRepository setRepository
										, PointRepository pointRepository){
        return args -> {
            matchRepository.save(Match.builder()
                            //.id(UUID.randomUUID().toString())
                            .id("1")
							.idPoule("Poule 1")
							.idEquipe1("Equipe 1")
							.idEquipe2("Equipe 2")
							.idEquipeArbitre("Equipe")
                            .name("Equipe 1 contre Equipe 2")
							.nbSetsGagnants(1)
                            .typeFin("SEC")
                            .nbPoints(25)
							//.sets()
                    .build());

			// String uidSet = UUID.randomUUID().toString();
            // setRepository.save(Set.builder()
            //                 .id(uidSet)
            //                 .idMatch("Match n°1")
			// 				.numeroSet(1)
			// 				//.points
			// 				.build());

            pointRepository.save(Point.builder()
                            .id(UUID.randomUUID().toString())
                            .idMatch("Match n°1")
							//.idSet(uidSet)
							.numeroSet(1)
							.numeroPoint(1)
							.equipeGagnante("Equipe 1")
                    .build());


        };

	}
}



