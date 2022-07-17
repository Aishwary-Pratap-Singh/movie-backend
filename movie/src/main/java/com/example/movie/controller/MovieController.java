package com.example.movie.controller;

import com.example.movie.entity.Movie;
import com.example.movie.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping(value = "/movie/")
    public List<Movie> getAllUser() {
        return movieRepository.findAll();
    }

    @PostMapping("/movie/")
    public Movie postMovie(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

}
