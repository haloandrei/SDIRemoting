package com.haloandrei.remoting.client.service;

import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class ServiceClientClientSide implements ServiceClient {
    @Override
    public CompletableFuture<ArrayList<Movie>> getSortedMovies() {
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
    public CompletableFuture<ArrayList<Movie>> getAllMovies() {
        return null;
    }
}
