package org.example;

import org.example.model.Track;
import org.example.services.Spotify;
import org.example.services.SpotifyService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpotifyService spotifyService = new SpotifyService();
        Spotify spotify = spotifyService.populateData();

        Track foundTrack = spotify.searchTrackByName("song3");
        System.out.println("Found track: " + foundTrack);

        System.out.println("---------------------------------------");

        List<String> trackNames = spotify.listTracksByAuthor("Tom");
        System.out.println("Tracks by Tom: " + trackNames);

        System.out.println("---------------------------------------");

        spotify.searchTrackByName("song2").listenATrack(5);
        spotify.searchTrackByName("podcast1").listenATrack(12);
        spotify.searchTrackByName("song1").listenATrack(7);


        List<Track> top3MostListenedTracks = spotify.findTop3MostListenedTracks();
        System.out.println("The top 3 most listened tracks:");
        top3MostListenedTracks.forEach(System.out::println);
    }
}