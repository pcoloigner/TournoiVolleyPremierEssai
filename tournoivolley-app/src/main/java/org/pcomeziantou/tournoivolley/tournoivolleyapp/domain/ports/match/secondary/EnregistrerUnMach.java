package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary;

import java.util.UUID;

import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Match;

public interface EnregistrerUnMach {

    void enregistrerUnMatch(Match match, UUID uid);

}
