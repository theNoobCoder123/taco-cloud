package com.thenoobcoder123.tacocloud;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
    @NotBlank
    @Size(min=5, message="Name can't be less than 5 letters.")
    public String name;

    @NotNull
    @Size(min=1, message="You must choose atleast 1 ingredient.")
    public List<String> ingredients;
}