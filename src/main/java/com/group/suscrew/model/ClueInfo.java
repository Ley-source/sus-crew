package com.group.suscrew.model;

/** A hidden clue pointing to the Impostor. */
public record ClueInfo(String id, String room, String text, int tx, int ty) {
}
