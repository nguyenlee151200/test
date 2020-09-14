package com.neu.test.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Girl {

    @Autowired
    @Qualifier(value = "hoodie")
    private Outfit outfit;

}
