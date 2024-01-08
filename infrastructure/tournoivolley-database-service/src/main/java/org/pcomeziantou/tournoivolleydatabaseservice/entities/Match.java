package org.pcomeziantou.tournoivolleydatabaseservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Match {
    @Id
    private String id;
    private String name;
    private String idPoule;
    private String idEquipe1;
    private String idEquipe2;
    private String idEquipeArbitre;
    private Integer nbSetsGagnants;
    private String typeFin ; //= "DEUX_POINTS"; //"SEC"
    private Integer nbPoints;

    //private List<Set> sets = new ArrayList<>();
}