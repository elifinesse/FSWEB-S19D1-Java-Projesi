package com.workintech.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workintech.movies.dao.MovieActorRequest;
import com.workintech.movies.dto.MovieResponse;
import com.workintech.movies.entity.Actor;
import com.workintech.movies.entity.Movie;
import com.workintech.movies.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
    
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/")
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public Movie findById(@PathVariable long id){
        return movieService.findById(id);
    }

    @PostMapping("/")
    public MovieResponse save(@RequestBody MovieActorRequest movieActorRequest){
        Movie movie = movieActorRequest.getMovie();
        List<Actor> actorList = movieActorRequest.getActors();

        for (Actor actor : actorList) {
            movie.addActor(actor);
        }
        Movie saved = movieService.save(movie);
        return new MovieResponse(saved.getId(), saved.getName(), saved.getDirectorName(), saved.getRating(), saved.getReleaseDate());
    }

    @DeleteMapping("/{id}")
    public Movie delete(@PathVariable long id){
        return movieService.delete(id);
    }
}
