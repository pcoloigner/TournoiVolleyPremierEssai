package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match;

import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.primary.CreerUnMatch;

public class CreateurMatch implements CreerUnMatch{

    //Pour coller à l'exemple de StarShip, même si ici, ça ne colle pas tout à fait, fonctionnellement.
    MatchInventory MatchInventory;

    @Override
    public Match creerMatch(Equipe equipe1, Equipe equipe2, Equipe arbitre, TypeMatchFin typeFin,
            TypeMatchNbPointsFinSet nbPointsFin, TypeMatchNombreSetGagnants nbSets) {
        Match match = new Match(equipe1, equipe2, arbitre, typeFin, nbPointsFin, nbSets);

        return match;

        
    }

}
