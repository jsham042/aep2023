package edu.berkeley.aep;

// Understands how to convert between different types of quantity
public enum Unit {

    INCH(1, Type.LENGTH),
    FOOT(12, Type.LENGTH),
    YARD(36, Type.LENGTH),
    MILE(1760 * 36, Type.LENGTH),
    TBSP(3, Type.VOLUME),
    TSP(1, Type.VOLUME),
    OZ(6, Type.VOLUME),
    CUP(48, Type.VOLUME);

    private enum Type { LENGTH, VOLUME }
    private final int factor;
    private final Type type;

    Unit(int factor, Type type) {
        this.factor = factor;
        this.type = type;
    }

    public int convertTo(Unit unit, int magnitude) {
        if (type != unit.type) {
            throw new RuntimeException("Cannot convert a " + type + " to a " + unit.type);
        }
        return magnitude * factor / unit.factor;
    }
}
