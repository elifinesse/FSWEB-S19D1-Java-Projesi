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

import com.workintech.movies.entity.Actor;
import com.workintech.movies.service.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {
    
    private ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService){
        this.actorService = actorService;
    }

    @GetMapping("/")
    public List<Actor> findAll(){
        return actorService.findAll();
    }

    @GetMapping("/{id}")
    public Actor findById(@PathVariable long id){
        return actorService.findById(id);
    }

    @PostMapping("/")
    public Actor save(@RequestBody Actor actor){
        return actorService.save(actor);
    }

    @DeleteMapping("/{id}")
    public Actor delete(@PathVariable long id){
        return actorService.delete(id);
    }

}
