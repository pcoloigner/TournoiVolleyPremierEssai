package org.pcomeziantou.tournoivolleydatabaseservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Set {
    @Id
    private String id;
    private String idMatch;
    private Integer numeroSet;
    //private List<Point> points;// = new ArrayList<>();
}