package com.github.fernandotaa.periodproperty;

import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class Controller {

    @Value("${config.period}")
    private Period period;

    @GetMapping
    public Response get() {
        val date = LocalDate.now().plus(period);
        return Response.builder().date(date).build();
    }
}
