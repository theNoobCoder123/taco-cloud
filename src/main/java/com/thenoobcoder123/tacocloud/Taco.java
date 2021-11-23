package com.thenoobcoder123.tacocloud;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
    private Long id;

    @NotBlank
    @Size(min=5, message="Name can't be less than 5 letters.")
    private String name;

    @NotNull
    @Size(min=1, message="You must choose atleast 1 ingredient.")
    private List<String> ingredients;

    private Date createdAt;
}