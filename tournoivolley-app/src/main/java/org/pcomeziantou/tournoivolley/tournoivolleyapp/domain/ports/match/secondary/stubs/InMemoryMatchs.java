package org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary.stubs;

import com.patternity.annotation.ddd.stereotype.Stub;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.match.Match;
import org.pcomeziantou.tournoivolley.tournoivolleyapp.domain.ports.match.secondary.Matchs;

@Stub
public class InMemoryMatchs implements Matchs {
    private final Map<UUID, Match> matchs = new HashMap<>();

    @Override
    public Match getById(UUID id) {
        return matchs.get(id);
    }

    @Override
    public Match save(Match fleet) {
        matchs.put(fleet.getId(), fleet);
        return fleet;
    }
}
