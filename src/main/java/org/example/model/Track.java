package org.example.model;

public abstract class Track {
    private final int id;
    private String name;
    private int length;
    private int numberOfTimesPlayed;
    private static int count = 0;

    public Track(String name, int length) {
        this.id = ++count;
        this.name = name;
        this.length = length;
        this.numberOfTimesPlayed = 0;
    }

    public void listenATrack(int times) {
        this.numberOfTimesPlayed += times;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfTimesPlayed() {
        return numberOfTimesPlayed;
    }

    public void setNumberOfTimesPlayed(int numberOfTimesPlayed) {
        this.numberOfTimesPlayed = numberOfTimesPlayed;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Track.count = count;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", numberOfTimesPlayed=" + numberOfTimesPlayed +
                '}';
    }
}
