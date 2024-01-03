package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.mocks;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.CreateurMatch;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Equipe;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Match;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.TypeMatchFin;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.TypeMatchNbPointsFinSet;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.TypeMatchNombreSetGagnants;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.primary.CreerUnMatch;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary.EnregistrerUnMach;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary.LireUnMatch;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary.MatchInventory;

/**
 * Unit test for simple App.
 */
public class MatchTests {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        org.junit.jupiter.api.Assertions.assertTrue( true );
    }


    @Test void shouldCreateMatchUnSet21pointsSec(){


        Equipe equipe1 = new Equipe();
        Equipe equipe2 = new Equipe();
        Equipe arbitre = new Equipe();

        CreerUnMatch creerUnMatch = new CreateurMatch();

        Match match = creerUnMatch.creerMatch(equipe1, equipe2, arbitre
                        , TypeMatchFin.FIN_SEC 
                        , TypeMatchNbPointsFinSet.FIN_21_POINTS
                        , TypeMatchNombreSetGagnants.UN_SET
                        );
        
        org.junit.jupiter.api.Assertions.assertTrue( true );

        //MatchInventory matchInventory = 
        //matchInventory.enregistrerUnMatch(match);

        //EnregistrerUnMach enregistrerUnMach;
        UUID uid = new UUID(8, 8);
        //enregistrerUnMach.enregistrerUnMatch(match, null);
        
        //Une implémentation pour test de l'interface LireUnMatch
        LireUnMatch lireUnMatch = (UUID id) -> { 
            return match;
        };

        Match unMatch = lireUnMatch.lireUnMatch(uid);




    }
}
