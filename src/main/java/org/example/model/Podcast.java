package org.example.model;

public class Podcast extends Track {
    private int seasonNumber;
    private int trackNumber;

    public Podcast(String name, int length, int seasonNumber, int trackNumber) {
        super(name, length);
        this.seasonNumber = seasonNumber;
        this.trackNumber = trackNumber;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "seasonNumber=" + seasonNumber +
                ", trackNumber=" + trackNumber +
                '}';
    }
}