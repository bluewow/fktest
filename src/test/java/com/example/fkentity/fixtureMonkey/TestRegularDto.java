package com.example.fkentity.fixtureMonkey;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class TestRegularDto {

    @NotNull
    public String name;

    @NotNull
    @Pattern(regexp="^[a-zA-Z0-9][a-zA-Z0-9\\-]+[a-zA-Z0-9]$")
    public String pattern;

}
