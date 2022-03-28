package com.cleverlance.academy.meteostanice.controller;

import com.cleverlance.academy.meteostanice.model.Address;
import com.cleverlance.academy.meteostanice.model.Identification;
import com.cleverlance.academy.meteostanice.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorController {

    @GetMapping(path = "/identification")
    public ResponseEntity<Identification> getIdentification(){
        return ResponseEntity.ok(new Identification("Robertova meteostanice",
                new Address("Jana Žižky","1598/22","Most"),
                new Person("Robert", "Pretschner")));
    }
}
