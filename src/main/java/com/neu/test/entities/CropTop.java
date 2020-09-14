package com.neu.test.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CropTop implements Outfit{
    public CropTop() {
    }

    @Override
    public void wear() {
        System.out.println("Croptop");
    }
}
