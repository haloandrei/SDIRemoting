package com.haloandrei.remoting.client.config;

import com.haloandrei.remoting.common.ServiceMovie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientConfig {
    @Bean
    RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(ServiceMovie.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/ServiceMovie");
        return rmiProxyFactoryBean;
    }

}
