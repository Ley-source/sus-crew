package com.group.suscrew.model;

import java.util.List;

/** Everything the game needs, delivered in one JSON call (/api/config). */
public record GameConfig(String groupName, String shipName, String impostorId,
                         List<TaskInfo> tasks, List<ClueInfo> clues, List<CrewMember> crew) {
}
