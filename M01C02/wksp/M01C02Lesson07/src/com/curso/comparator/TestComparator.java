package com.curso.comparator;

import java.util.Comparator;

/**
 * @author JLIL
 */
public class TestComparator {

}

class ChainingComparator implements Comparator<Squirrel> {

    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparingInt(s -> s.getWeight());
        return c.compare(s1, s2);
    }
}

class Squirrel {

    private int weight;
    private String species;

    public Squirrel(String theSpecies) {
        if (theSpecies == null) {
            throw new IllegalArgumentException();
        }
        species = theSpecies;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }
}
