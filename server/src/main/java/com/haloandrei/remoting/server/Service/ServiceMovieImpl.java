package com.haloandrei.remoting.server.Service;

import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.common.domain.Movie;


import java.util.Arrays;
import java.util.List;

public class ServiceMovieImpl implements ServiceMovie {
    @Override
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie("action","Bond",6,12));
    }
}
