package com.group.suscrew.controller;

import com.group.suscrew.service.CrewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Spring MVC controller: each URL renders the same Thymeleaf page (game.html)
 * but tells the JavaScript which screen to open first. Game progress lives in the browser.
 */
@Controller
public class PageController {

    private final CrewService crewService;

    public PageController(CrewService crewService) {
        this.crewService = crewService;
    }

    @GetMapping({"/", "/menu"})
    public String menu(Model model) { return page("menu", model); }

    @GetMapping("/play")
    public String play(Model model) { return page("play", model); }

    @GetMapping("/crew")
    public String crew(Model model) { return page("crew", model); }

    @GetMapping("/results")
    public String results(Model model) { return page("results", model); }

    private String page(String screen, Model model) {
        var cfg = crewService.getConfig();
        model.addAttribute("screen", screen);
        model.addAttribute("title", "Sus Crew | " + cfg.groupName());
        model.addAttribute("groupName", cfg.groupName());
        model.addAttribute("shipName", cfg.shipName());
        return "game";
    }
}
