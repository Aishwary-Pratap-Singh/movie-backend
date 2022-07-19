package com.example.movie.repo;

import com.example.movie.entity.Director;
import com.example.movie.entity.MovieDirector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieDirectorRepository extends JpaRepository<MovieDirector, Long> {
    public List<MovieDirector> findByDirector(Director director);}
