package org.example;

import org.example.model.Track;
import org.example.services.Spotify;
import org.example.services.SpotifyService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpotifyService spotifyService = new SpotifyService();
        Spotify spotify = spotifyService.populateData();

//        Track foundTrack = spotify.searchTrackByName("song3");
//        System.out.println("Found track: " + foundTrack);

//        List<String> trackNames = spotify.listTracksByAuthor("Tom");
//        System.out.println("Tracks by Tom: " + trackNames);

        Track foundTrack1 = spotify.searchTrackByName("song2");
        foundTrack1.listenATrack();
        foundTrack1.listenATrack();
        foundTrack1.listenATrack();
        foundTrack1.listenATrack();
        foundTrack1.listenATrack();

        Track foundTrack2 = spotify.searchTrackByName("podcast1");
        foundTrack2.listenATrack();

        Track foundTrack3 = spotify.searchTrackByName("song1");
        foundTrack3.listenATrack();
        foundTrack3.listenATrack();
        foundTrack3.listenATrack();
        foundTrack3.listenATrack();
        foundTrack3.listenATrack();
        foundTrack3.listenATrack();

        List<Track> top3MostListenedTracks = spotify.findTop3MostListenedTracks();
        System.out.println("The top 3 most listened tracks:");
        top3MostListenedTracks.forEach(System.out::println);
    }
}