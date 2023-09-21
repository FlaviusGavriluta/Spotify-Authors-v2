package org.example.model;

public abstract class Track {
    private String name;
    private int length;
    private int numberOfTimesPlayed;
    private static int count = 0;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
        this.numberOfTimesPlayed = playMusic();
    }

    public int playMusic() {
        ++count;
        return count;
    }
}
