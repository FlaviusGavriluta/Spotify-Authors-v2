package org.example.services;

import org.example.enums.MusicStyle;
import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class SpotifyService {
    public Spotify populateData() {
        Spotify spotify = new Spotify();

        // Create some songs:
        List<Song> songs = new ArrayList<>();
        int numberOfSongs = 10;
        for (int i = 1; i < numberOfSongs + 1; i++) {
            Song song = new Song("Song" + i, 210, "Lyrics" + i);
            songs.add(song);
        }

        // Create an album:
        Album a1 = new Album("Album1", MusicStyle.JAZZ, songs);

        // Create a songwriter and add the album:
        SongwriterAuthor sa1 = new SongwriterAuthor("Songwriter1");
        sa1.setAlbums(List.of(a1));

        // Create some podcasts:
        List<Podcast> podcasts = new ArrayList<>();
        int numbersOfPodcasts = 10;
        for (int i = 1; i < numbersOfPodcasts + 1; i++) {
            Podcast podcast = new Podcast("Podcast" + i, 1500, 1);
            podcasts.add(podcast);
        }

        // Create a podcast author:
        PodcastAuthor pa1 = new PodcastAuthor("Tom");
        pa1.setPodcastList(podcasts);

        spotify.addAuthor(sa1);
        spotify.addAuthor(pa1);

        return spotify;
    }
}