package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class SongwriterAuthor extends Author {
    private List<Album> albums;

    public SongwriterAuthor(String name) {
        super(name);
        this.albums = new ArrayList<>();
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "SongwriterAuthor{" +
                "albums=" + albums +
                '}';
    }
}