package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.primary;

import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Equipe;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Match;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.TypeMatchFin;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.TypeMatchNbPointsFinSet;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.TypeMatchNombreSetGagnants;

public interface CreerUnMatch {
    Match creerMatch(Equipe equipe1, Equipe equipe2, Equipe arbitre, TypeMatchFin typeFin, TypeMatchNbPointsFinSet nbPointsFin, TypeMatchNombreSetGagnants nbSets);
}
