package com.haloandrei.remoting.client.config;

import com.haloandrei.remoting.common.ServiceAcquisition;
import com.haloandrei.remoting.common.ServiceClient;
import com.haloandrei.remoting.common.ServiceMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientConfig {

    @Bean
    RmiProxyFactoryBean rmiMovie() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(ServiceMovie.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/ServiceMovie");

        return rmiProxyFactoryBean;
    }
    @Bean
    RmiProxyFactoryBean rmiClient() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(ServiceClient.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/ServiceClient");

        return rmiProxyFactoryBean;
    }

    @Bean
    RmiProxyFactoryBean rmiAcquisition() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(ServiceAcquisition.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/ServiceAcquisition");

        return rmiProxyFactoryBean;
    }

}
