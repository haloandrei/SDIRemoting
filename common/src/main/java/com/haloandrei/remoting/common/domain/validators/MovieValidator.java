package com.haloandrei.remoting.common.domain.validators;


import com.haloandrei.remoting.common.domain.Movie;

import java.util.stream.IntStream;

public class MovieValidator implements Validator<Movie> {
    @Override
    public void validate(Movie entity) throws ValidatorException {
        entity.getName().chars().findAny().orElseThrow(() -> new ValidatorException("The title cannot be empty"));
        entity.getType().chars().findAny().orElseThrow(() -> new ValidatorException("The genre cannot be empty"));
        IntStream.of(entity.getRating()).filter(e -> e >= 0 && e <= 10).findAny().orElseThrow(() -> new ValidatorException("The year of the release is incorrect!"));
    }
}