package com.haloandrei.remoting.server.config;


import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.ServiceMovie;
import com.haloandrei.remoting.server.service.ServiceAcquisitionImpl;
import com.haloandrei.remoting.server.service.ServiceClientImpl;
import com.haloandrei.remoting.server.service.ServiceMovieImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class ServiceConfig {

    @Bean
    RmiServiceExporter rmiMovie(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("ServiceMovie");
        rmiServiceExporter.setServiceInterface(ServiceMovie.class);
        rmiServiceExporter.setService(serviceMovie());
        return rmiServiceExporter;
    }

    @Bean
    RmiServiceExporter rmiClient(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("ServiceClient");
        rmiServiceExporter.setServiceInterface(ServiceClient.class);
        rmiServiceExporter.setService(serviceClient());
        return rmiServiceExporter;
    }

    @Bean
    RmiServiceExporter rmiAcquisition(){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("ServiceAcquisition");
        rmiServiceExporter.setServiceInterface(ServiceAcquisition.class);
        rmiServiceExporter.setService(serviceAcquisition());
        return rmiServiceExporter;
    }

    @Bean
    ServiceMovie serviceMovie() {
        return new ServiceMovieImpl();
    }

    @Bean
    ServiceClient serviceClient() {
        return new ServiceClientImpl();
    }

    @Bean
    ServiceAcquisition serviceAcquisition() {
        return new ServiceAcquisitionImpl();
    }
}
