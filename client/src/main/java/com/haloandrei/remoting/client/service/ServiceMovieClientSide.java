package com.haloandrei.remoting.client.service;

import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class ServiceMovieClientSide implements ServiceMovie {
    @Autowired
    private ServiceMovie movieService;


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
        return movieService.getAllMovies();
    }
}
