package com.thenoobcoder123.tacocloud;

import java.util.List;

import lombok.Data;

@Data
public class Taco {
    public List<Ingredient> ingredients;
    public String name;
}