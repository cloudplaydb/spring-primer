package com.spring.primer.x.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 http://localhost:8080/beans
 */
@RestController
public class TotalController {

    @GetMapping("/beans")
    List<String> getBeans() {
        List<String> beans = new ArrayList<>();
        beans.add("moong beans");
        beans.add("fava beans");
        beans.add("crazy beans");
       return beans;
    }
}
