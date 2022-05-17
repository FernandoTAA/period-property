package com.github.fernandotaa.periodproperty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class Controller {

    @Value("${picpay.period}")
    private Period period;

    @GetMapping
    public Response get() {
        return Response.builder().date(LocalDate.now().plus(period)).build();
    }
}
