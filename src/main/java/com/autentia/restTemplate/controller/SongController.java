package com.autentia.restTemplate.controller;

import com.autentia.restTemplate.model.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/apiExternal/v1/songs")
public class SongController {


    @GetMapping("/{title}")
    public Song show(@PathVariable("title") String title){
        double rate = Double.parseDouble(String.format("%.1f", Math.random() * 6 + 4 ));
        Song song = new Song(title, rate);
        return song;
    }

}
