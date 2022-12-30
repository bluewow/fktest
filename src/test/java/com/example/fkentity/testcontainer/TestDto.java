package com.example.fkentity.testcontainer;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class TestDto {

    @NotNull
    private String name;

    @Pattern(regexp="^[a-zA-Z0-9][a-zA-Z0-9\\-]+[a-zA-Z0-9]$")
    private String pattern;

}
