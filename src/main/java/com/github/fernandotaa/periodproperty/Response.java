package com.github.fernandotaa.periodproperty;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
@Builder
@Getter
public class Response {

    private LocalDate date;

}
