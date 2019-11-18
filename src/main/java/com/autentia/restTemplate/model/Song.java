package com.autentia.restTemplate.model;

public class Song {
    private long id;
    private double rate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Song(long id, double rate) {
        this.id = id;
        this.rate = rate;
    }
}
