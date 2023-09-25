package org.example.services;

import org.example.enums.MusicStyle;
import org.example.model.*;

import java.util.List;

public class SpotifyService {
    public Spotify populateData() {
        Spotify spotify = new Spotify();

        // Create some songs:
        Song s1 = new Song("Song1", 200, "Lyrics1");
        Song s2 = new Song("Song2", 250, "Lyrics2");
        Song s3 = new Song("Song3", 300, "Lyrics3");

        // Create an album:
        Album a1 = new Album("Album1", MusicStyle.JAZZ, List.of(s1, s2, s3));

        // Create a songwriter and add the album:
        SongwriterAuthor sa1 = new SongwriterAuthor("Songwriter1");
        sa1.setAlbums(List.of(a1));

        // Create some podcasts:
        Podcast p1 = new Podcast("Podcast1", 1000, 1);
        Podcast p2 = new Podcast("Podcast2", 1500, 2);

        // Create a podcast author:
        PodcastAuthor pa1 = new PodcastAuthor("Tom");
        pa1.setPodcastList(List.of(p1, p2));

        spotify.addAuthor(sa1);
        spotify.addAuthor(pa1);

        return spotify;
    }
}