package org.example.model;

public class Song extends Track {
    private String lyrics;

    public Song(String name, int length, String lyrics) {
        super(name, length);
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "Song{" +
                "lyrics='" + lyrics + '\'' +
                '}';
    }
}