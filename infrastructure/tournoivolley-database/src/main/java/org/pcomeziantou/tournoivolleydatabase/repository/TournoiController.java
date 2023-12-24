package org.pcomeziantou.tournoivolleydatabase.repository;

import java.util.List;

import org.pcomeziantou.tournoivolleydatabase.entities.Tournoi;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TournoiController {
    private TournoiRepository tournoiRepository;

    public TournoiController(TournoiRepository tournoiRepository){
        this.tournoiRepository = tournoiRepository;
    }

    @GetMapping("/tournois")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String tournois(Model model){
        List<Tournoi> tournoiList = tournoiRepository.findAll();
        model.addAttribute("tournois", tournoiList);
        return "tournois";
    }

    @GetMapping("/auth")
    @ResponseBody
    public Authentication authentication(Authentication authentication){
        return authentication;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/notAuthorized")
    public String notAuthorized(){
        return "notAuthorized";
    }


}
