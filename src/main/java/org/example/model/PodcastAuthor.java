package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class PodcastAuthor extends Author {
    private List<Podcast> podcastList;

    public PodcastAuthor(String name) {
        super(name);
        this.podcastList = new ArrayList<>();
    }

    public List<Podcast> getPodcastList() {
        return podcastList;
    }

    public void setPodcastList(List<Podcast> podcastList) {
        this.podcastList = podcastList;
    }

    @Override
    public String toString() {
        return "PodcastAuthor{" +
                "podcastList=" + podcastList +
                '}';
    }
}
