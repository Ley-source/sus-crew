package com.group.suscrew.controller;

import com.group.suscrew.model.CrewMember;
import com.group.suscrew.model.GameConfig;
import com.group.suscrew.service.CrewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** REST endpoints that the JavaScript game fetches. Returns JSON. */
@RestController
@RequestMapping("/api")
public class CrewApiController {

    private final CrewService crewService;

    public CrewApiController(CrewService crewService) {
        this.crewService = crewService;
    }

    @GetMapping("/config")
    public GameConfig config() { return crewService.getConfig(); }

    @GetMapping("/crew")
    public List<CrewMember> crew() { return crewService.getCrew(); }

    @GetMapping("/crew/{id}")
    public ResponseEntity<CrewMember> member(@PathVariable String id) {
        return crewService.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
