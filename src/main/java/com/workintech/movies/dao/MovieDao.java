package com.workintech.movies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workintech.movies.entity.Movie;

public interface MovieDao extends JpaRepository<Movie, Long>{
    
}
