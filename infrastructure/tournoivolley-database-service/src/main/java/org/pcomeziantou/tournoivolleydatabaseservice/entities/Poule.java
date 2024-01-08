package org.pcomeziantou.tournoivolleydatabaseservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Poule {
    @Id
    private String id;
    private String name;
    private String idPhase;
}