package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;

import com.example.beans.Tyres;
import com.example.beans.Speakers;

@ComponentScan(basePackages = {"com.example.component", "com.example.aspects"})
@Configuration
@EnableAspectJAutoProxy
public class ProjectConfig {

    // Tyres Beans 

    @Bean(value = "bridgeStoneTyres")
    Tyres getBridgeStoneTyres() {
        return new com.example.beans.BridgeStoneTyres();
    }

    @Bean(value = "MichelinTyres")
    @Primary
    Tyres getMichelinTyres() {
        return new com.example.beans.MichelinTyres();
    }

    // Speakers Beans

    @Bean(value = "SonySpeakers")
    @Primary
    Speakers getSonySpeakers() {
        return new com.example.beans.SonySpeakers();
    }

    @Bean(value = "BoseSpeakers")
    Speakers getBoseSpeakers() {
        return new com.example.beans.BoseSpeakers();
    }
}
