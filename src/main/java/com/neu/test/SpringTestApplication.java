package com.neu.test;


import com.neu.test.entities.Girl;
import com.neu.test.entities.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootConfiguration

public class SpringTestApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(TestApplication.class, args);
        Outfit outfit = context.getBean(Outfit.class);
        Girl girl = context.getBean(Girl.class);
        System.out.println(girl.getOutfit());
        outfit.wear();
    }

}


