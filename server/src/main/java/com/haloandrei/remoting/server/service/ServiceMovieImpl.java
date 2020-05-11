package com.haloandrei.remoting.server.service;

import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ServiceMovieImpl implements ServiceMovie {
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
        //TODO de returnat toate filmele din JDBC
        return ;
    }
}
