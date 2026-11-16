# SUS CREW - Among Us-inspired group profile game

Java 17 + Spring Boot 3 (Spring MVC, Thymeleaf, REST) serving an HTML5 Canvas game.

## Run
    mvn spring-boot:run
Open http://localhost:8080 (press F for fullscreen).

## Customise (all in Java, no front-end edits needed)
- `application.properties`: group name, ship name, who the Impostor is (m1-m4)
- `CrewService.java`: names, nicknames, hobbies, jokes, clues, task positions

## Who explains what
1. Spring Boot: `PageController`, `CrewApiController`, `CrewService`, models
2. Game engine: `game.js` sections 3-5 (sprite, map, collision, camera, doors)
3. Mini-games: `game.js` section 6 (wiring, swipe, garbage, upload, navigation)
4. UI and story: `game.js` sections 7-8, `game.html`, `style.css` (unlocks, database, meeting, results)

## Request flow
Browser -> `PageController` (Thymeleaf page) -> `game.js` fetches `/api/config` -> `CrewApiController` -> `CrewService` data.
Progress is stored in the browser's localStorage so it survives page changes.
