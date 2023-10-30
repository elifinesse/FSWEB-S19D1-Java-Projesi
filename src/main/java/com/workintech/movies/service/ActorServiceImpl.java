package com.workintech.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.workintech.movies.dao.ActorDao;
import com.workintech.movies.entity.Actor;

@Service
public class ActorServiceImpl implements ActorService{

    private ActorDao actorDao;

    @Override
    public List<Actor> findAll() {
        return actorDao.findAll();
    }

    @Override
    public Actor findById(long id) {
        Optional<Actor> actorOpt = actorDao.findById(id);
        if(actorOpt.isPresent()){
            return actorOpt.get();
        }
        return null;
    }

    @Override
    public Actor save(Actor actor) {
        return actorDao.save(actor);
    }

    @Override
    public Actor delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
