package com.curso.patterns;

import java.util.List;

/**
 * @author JLIL
 */
public class TestBuilder {
    public static void main(String[] args) {
        AnimalBuilder builder = new AnimalBuilder();
        
        Animal a = builder.setAge(2).setSpecies("Gato").build();
    }
}

class AnimalBuilder {

    private String species;
    private int age;
    private List<String> favoriteFoods;

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build() {
        return new Animal(species, age, favoriteFoods);
    }
}
