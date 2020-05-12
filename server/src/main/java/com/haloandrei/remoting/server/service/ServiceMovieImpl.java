package com.haloandrei.remoting.server.service;

import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;
import org.springframework.scheduling.annotation.AsyncResult;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;


public class ServiceMovieImpl implements ServiceMovie {


    @Override
    public Future<List<Movie>> getSortedMovies() {
        return null;
    }

    @Override
    public void addMovie(Movie movie) throws ValidatorException {

    }

    @Override
    public void deleteMovie(Integer id) throws ValidatorException {

    }

    @Override
    public void updateMovie(Movie movie) throws ValidatorException {

    }

    @Override
    public ArrayList<Movie> getAllMovies() {
        //TODO de returnat toate filmele din JDBC

        ArrayList<Movie> list = new ArrayList<Movie>();
       // new Movie("a","b",10,10)
        list.add(new Movie("a","b",10,10));
        list.add(new Movie("d","c",10,10));
        return list;
    }
}
