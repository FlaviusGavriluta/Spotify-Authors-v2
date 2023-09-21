package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Album> albums=new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", albums=" + albums +
                '}';
    }
}
