package com.neu.test.entities;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class Bikini implements Outfit {
    public Bikini() {
        System.out.println("bikini init");
    }

    @Override
    public void wear() {
        System.out.println("Bikini!!");    }
}
