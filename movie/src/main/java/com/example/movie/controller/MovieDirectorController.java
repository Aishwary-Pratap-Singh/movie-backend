package com.example.movie.controller;

import com.example.movie.entity.MovieDirector;
import com.example.movie.repo.MovieDirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class MovieDirectorController {

    @Autowired
    MovieDirectorRepository movieDirectorRepository;

    @GetMapping(value = "/moviedirector/")
    public List<MovieDirector> getAllMovie() {
        return movieDirectorRepository.findAll();
    }
}
