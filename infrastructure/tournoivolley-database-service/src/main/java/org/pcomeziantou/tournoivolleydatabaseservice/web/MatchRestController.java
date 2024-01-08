package org.pcomeziantou.tournoivolleydatabaseservice.web;

import java.util.List;

import org.pcomeziantou.tournoivolleydatabaseservice.entities.Match;
import org.pcomeziantou.tournoivolleydatabaseservice.entities.Point;
import org.pcomeziantou.tournoivolleydatabaseservice.repository.MatchRepository;
import org.pcomeziantou.tournoivolleydatabaseservice.repository.PointRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchRestController {

    private MatchRepository matchRepository;
    private PointRepository pointRepository;

    public MatchRestController(MatchRepository matchRepository, PointRepository pointRepository) {
        this.matchRepository = matchRepository;
        this.pointRepository = pointRepository;
    }

    @GetMapping("/matchs")
    public List<Match> matchs(){
        return matchRepository.findAll();
    }

    @GetMapping("/points")
    public List<Point> points(){
        return pointRepository.findAll();
    }


}
