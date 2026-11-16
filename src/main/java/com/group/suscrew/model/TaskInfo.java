package com.group.suscrew.model;

/** A task station on the ship. tx/ty are tile coordinates; unlocks = member id (null for the final task). */
public record TaskInfo(String id, String title, String room, String icon, String hint,
                       int tx, int ty, String unlocks) {
}
