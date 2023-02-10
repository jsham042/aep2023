package edu.berkeley.aep;

public enum Unit {
    INCH(1), FOOT(12), YARD(36), MILE(1760 * 36);

    private final int factor;

    Unit(int factor) {
        this.factor = factor;
    }

    public int convertTo(Unit unit, int magnitude) {
        return magnitude * factor / unit.factor;
    }
}
