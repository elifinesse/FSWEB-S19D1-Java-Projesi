package com.workintech.movies.service;

import java.util.List;

import com.workintech.movies.entity.Actor;
import com.workintech.movies.entity.Movie;

public interface MovieService {
    
    List<Movie> findAll();
    Movie findById(long id);
    Movie save(Movie movie);
    Movie delete(long id);
}
