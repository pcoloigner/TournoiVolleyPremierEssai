package org.pcomeziantou.tournoivolleydatabase.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pcomeziantou.tournoivolleydatabase.entities.Tournoi;
import org.pcomeziantou.tournoivolleydatabase.repository.TournoiRepository;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TournoiController {
    private TournoiRepository tournoiRepository;

    private ClientRegistrationRepository clientRegistrationRepository;

    public TournoiController(TournoiRepository tournoiRepository, ClientRegistrationRepository clientRegistrationRepository){
        this.tournoiRepository = tournoiRepository;
        this.clientRegistrationRepository = clientRegistrationRepository;
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

    
    @GetMapping("/oauth2Login")
    public String oauth2Login(Model model) {
        String authorizationRequestBaseUri = "oauth2/authorization";
        Map<String, String> oauth2AuthenticationUrls = new HashMap();
        Iterable<ClientRegistration> clientRegistrations = (Iterable<ClientRegistration>) clientRegistrationRepository;;
        clientRegistrations.forEach(registration ->{
            oauth2AuthenticationUrls.put(registration.getClientName(),
                    authorizationRequestBaseUri + "/" + registration.getRegistrationId());
        });
        model.addAttribute("urls", oauth2AuthenticationUrls);
        return "oauth2Login";
    }

}
