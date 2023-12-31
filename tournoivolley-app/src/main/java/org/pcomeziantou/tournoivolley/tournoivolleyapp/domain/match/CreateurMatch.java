package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match;

import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.CreerUnMatch;

public class CreateurMatch implements CreerUnMatch{

    @Override
    public Match creerMatch(Equipe equipe1, Equipe equipe2, Equipe arbitre, TypeMatchFin typeFin,
            TypeMatchNbPointsFinSet nbPointsFin, TypeMatchNombreSetGagnants nbSets) {
        Match match = new Match(equipe1, equipe2, arbitre, typeFin, nbPointsFin, nbSets);

        return match;

        
    }

}
