package com.haloandrei.remoting.server.config;


import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.server.service.ServiceMovieImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class ServiceConfig {

    @Bean
    RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("ServiceMovie");
        rmiServiceExporter.setServiceInterface(ServiceMovie.class);
        rmiServiceExporter.setService(serviceMovie());
        return rmiServiceExporter;
    }

    @Bean
    ServiceMovie serviceMovie() {
        return new ServiceMovieImpl();
    }
}
