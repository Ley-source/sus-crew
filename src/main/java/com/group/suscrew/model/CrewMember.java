package com.group.suscrew.model;

import java.util.List;
import java.util.Map;

/** One group member / crewmate profile. Sent to the browser as JSON. */
public record CrewMember(
        String id, String name, String nickname, String color, String role,
        String personality, List<String> hobbies, List<String> skills,
        Map<String, Integer> stats, List<String> strengths, List<String> weaknesses,
        List<String> funFacts, List<String> insideJokes, String assignment,
        String taskId, String meetingLine, String ejectReason) {
}
