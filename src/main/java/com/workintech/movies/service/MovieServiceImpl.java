package com.workintech.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workintech.movies.dao.MovieDao;
import com.workintech.movies.entity.Actor;
import com.workintech.movies.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieDao movieDao;

    @Autowired
    public MovieServiceImpl(MovieDao movieDao){
        this.movieDao = movieDao;
    }

    @Override
    public List<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Movie findById(long id) {
        Optional<Movie> movieOpt = movieDao.findById(id);
        if(movieOpt.isPresent()){
            return movieOpt.get();
        }
        return null;
    }

    @Override
    public Movie save(Movie movie) {
        return movieDao.save(movie);
    }

    @Override
    public Movie delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
