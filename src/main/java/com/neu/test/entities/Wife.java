package com.neu.test.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Wife {
    private  Outfit outfit;
    @Autowired

    public Wife() {
    }
    public void getOut() {
          outfit.wear();
        System.out.println("Đã mặc");
    }
}
