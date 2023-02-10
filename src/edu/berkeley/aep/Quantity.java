package edu.berkeley.aep;

// Understands various physical units and how to compare them
public class Quantity {
    private final int magnitude;
    private final Unit unit;

    public Quantity(int magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        return magnitude * unit.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Quantity otherQuantity)) return false;
        return magnitude == otherQuantity.convertTo(unit).magnitude;
    }

    private Quantity convertTo(Unit unit) {
        return new Quantity(this.unit.convertTo(unit, magnitude), unit);
    }

    @Override
    public String toString() {
        return magnitude + " " + unit;
    }
}
