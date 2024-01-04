package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary;

import java.util.UUID;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Match;

public interface Matchs {

    Match getById(UUID id);

    Match save(Match fleet);

}


