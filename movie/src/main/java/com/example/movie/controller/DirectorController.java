package com.example.movie.controller;

import com.example.movie.entity.Director;
import com.example.movie.entity.Movie;
import com.example.movie.repo.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DirectorController {

    @Autowired
    DirectorRepository directorRepository;

    @GetMapping(value = "/director/")
    public List<Director> getAllUser() {
        return directorRepository.findAll();
    }

    @PostMapping("/director/")
    public Director postMovie(@RequestBody Director director){
        return directorRepository.save(director);
    }
}
