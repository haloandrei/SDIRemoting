package com.haloandrei.remoting.client.commands;

import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.ServiceMovie;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ListMoviesCommand implements Command {
    @Override
    public void execute(Scanner scanner, ServiceMovie serviceMovie, ServiceClient serviceClient, ServiceAcquisition serviceAcquisition) {

            serviceMovie.getAllMovies().forEach(System.out::println);
    }
}
