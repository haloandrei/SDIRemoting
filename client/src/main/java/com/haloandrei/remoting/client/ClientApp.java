package com.haloandrei.remoting.client;



import com.haloandrei.remoting.client.service.ServiceAcquisitionClientSide;
import com.haloandrei.remoting.client.service.ServiceClientClientSide;
import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.ServiceMovie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        "com.haloandrei.remoting.client.config"
                );

        ServiceMovie serviceMovie = context.getBean(ServiceMovie.class);
        //TODO Beans pt client si Acquisitions
        ServiceClient serviceClient =context.getBean(ServiceClient.class);

        ServiceAcquisition serviceAcquisition = context.getBean(ServiceAcquisition.class);
        Console console = new Console( serviceMovie,serviceClient,serviceAcquisition);
        console.run();

        System.out.println("bye");
    }
}

