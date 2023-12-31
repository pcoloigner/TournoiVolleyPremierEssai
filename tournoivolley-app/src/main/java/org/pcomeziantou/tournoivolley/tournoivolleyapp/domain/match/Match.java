package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Match {
    UUID matchId;
    Equipe equipeUn;
    Equipe equipeDeux;
    Equipe arbitre;

    TypeMatchFin typeMatchFin;
    TypeMatchNbPointsFinSet typeMatchNbPointsFinSet;
    TypeMatchNombreSetGagnants typeMatchNombreSetGagnants;

    List<Set> sets = new ArrayList<>();
    
    public Match(Equipe equipe1, Equipe equipe2, Equipe arbitre, TypeMatchFin typeFin,
            TypeMatchNbPointsFinSet nbPointsFin, TypeMatchNombreSetGagnants nbSets) {
                this.equipeUn = equipe1;
                this.equipeDeux = equipe2;
                this.arbitre = arbitre;
                this.typeMatchFin = typeFin;
                this.typeMatchNbPointsFinSet = nbPointsFin;
                this.typeMatchNombreSetGagnants = nbSets;

                this.sets = new ArrayList<>();

    }

    public boolean isMatchEnCours(){
        return true;
    }

    public boolean isMatchTermine(){
        return false;
    }

    public boolean isMatchCommence(){
        return false;
    }


    

}
