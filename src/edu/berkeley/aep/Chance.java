package edu.berkeley.aep;

import java.util.Objects;

public class Chance {

    private final double probability;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chance chance)) return false;
        return Double.compare(chance.probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(probability);
    }

    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance not() {
        return new Chance(1 - probability);
    }

    public Chance and(Chance other) {
        return new Chance(probability * other.probability);
    }

    public Chance or(Chance other) {
        // De Morgan's Law: P(A || B) = !(!P(A) && !P(B))
        return not().and(other.not()).not();
    }

    @Override
    public String toString() {
        return "Chance with probabiltiy " + probability;
    }
}
