package com.example.movie.entity;

import javax.persistence.*;

@Entity
public class MovieDirector {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //    Movie
    @ManyToOne(fetch = FetchType.EAGER)
    private Movie movie;

    //    Director
    @ManyToOne
    private Director director;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
