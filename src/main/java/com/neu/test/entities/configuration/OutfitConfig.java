package com.neu.test.entities.configuration;

import com.neu.test.entities.Bikini;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

@Configuration
public class OutfitConfig {

    @Bean
    public Bikini bikini2(){
        Bikini bikini = new Bikini();
        return bikini;
    }
}
