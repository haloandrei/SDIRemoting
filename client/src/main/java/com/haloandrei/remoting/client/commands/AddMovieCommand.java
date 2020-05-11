package com.haloandrei.remoting.client.commands;

import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.common.domain.Movie;
import com.haloandrei.remoting.common.domain.validators.MovieRentalException;
import com.haloandrei.remoting.common.domain.validators.ValidatorException;

import java.util.Scanner;

public class AddMovieCommand implements Command{
    @Override
    public void execute(Scanner scanner, ServiceMovie serviceMovie, ServiceClient serviceClient, ServiceAcquisition serviceAcquisition) {

        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Type: ");
        String type = scanner.next();
        System.out.println("Rating: ");
        int rating = scanner.nextInt();
        System.out.println("Price: ");
        int price = scanner.nextInt();
        try {
            serviceMovie.addMovie(new Movie( type, name, rating, price));
        } catch (ValidatorException e) {
            System.out.println(e.toString());
        }
    }
}
