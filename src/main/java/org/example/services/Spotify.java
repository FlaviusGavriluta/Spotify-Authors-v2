package org.example.services;

import org.example.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Spotify {
    private List<Author> authors;

    public Spotify() {
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Track searchTrackByName(String trackName) {
        return authors.stream()
                .flatMap(author -> author instanceof SongwriterAuthor ?
                        ((SongwriterAuthor) author).getAlbums().stream()
                                .flatMap(album -> album.getSongs().stream())
                        : author instanceof PodcastAuthor ?
                        ((PodcastAuthor) author).getPodcastList().stream()
                        : Stream.empty())
                .filter(track -> track.getName().equalsIgnoreCase(trackName))
                .findFirst()
                .orElse(null);
    }

    public List<String> listTracksByAuthor(String authorName) {
        return authors.stream()
                .filter(author -> author.getName().equalsIgnoreCase(authorName))
                .flatMap(author -> author instanceof SongwriterAuthor ?
                        ((SongwriterAuthor) author).getAlbums().stream()
                                .flatMap(album -> album.getSongs().stream()
                                        .map(Song::getName))
                        : author instanceof PodcastAuthor ?
                        ((PodcastAuthor) author).getPodcastList().stream()
                                .map(Podcast::getName)
                        : Stream.empty())
                .toList();
    }

    public List<Track> findTop3MostListenedTracks() {
        return authors.stream()
                .flatMap(author -> author instanceof SongwriterAuthor ?
                        ((SongwriterAuthor) author).getAlbums().stream()
                                .flatMap(album -> album.getSongs().stream())
                        : author instanceof PodcastAuthor ?
                        ((PodcastAuthor) author).getPodcastList().stream()
                        : Stream.empty())
                .sorted(Comparator.comparingInt(Track::getNumberOfTimesPlayed)
                        .reversed())
                .limit(3)
                .toList();
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Spotify{" +
                "authors=" + authors +
                '}';
    }
}