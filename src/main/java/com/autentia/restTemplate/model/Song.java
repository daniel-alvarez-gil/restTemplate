package com.autentia.restTemplate.model;

public class Song {
    private String title;
    private double rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Song(String title, double rate) {
        this.title = title;
        this.rate = rate;
    }
}
