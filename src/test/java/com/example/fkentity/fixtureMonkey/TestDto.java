package com.example.fkentity.fixtureMonkey;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.List;

import static com.example.fkentity.fixtureMonkey.ValidationPolicy.*;

@Data
public class TestDto {

    @Size(max = MAX) @NotNull
    public String name;

    @Max(MAX) @Min(MIN)
    public int integer;

    @Size(max = LIST_MAX)
    public List<String> lists;

}
