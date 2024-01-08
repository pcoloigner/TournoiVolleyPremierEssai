package org.pcomeziantou.tournoivolleydatabaseservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Point {
    @Id
    private String id;
    private String idMatch;
    //private String idSet;
    private Integer numeroSet;
    private Integer numeroPoint;
    private String equipeGagnante; // "1" ou "2"
}