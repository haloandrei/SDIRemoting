package com.haloandrei.remoting.client.commands;

import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.ServiceMovie;

import java.util.Scanner;

public class WrongCommand implements Command {
    @Override
    public void execute(Scanner scanner, ServiceMovie serviceMovie, ServiceClient serviceClient, ServiceAcquisition serviceAcquisition) {
        System.out.println("wrong command");
    }
}
