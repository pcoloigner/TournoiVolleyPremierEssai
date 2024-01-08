package org.pcomeziantou.tournoivolleydatabaseservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Phase {
    
    @Id
    private String id;
    private String idTournoi;
    private String name;

}