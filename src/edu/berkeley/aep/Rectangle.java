package edu.berkeley.aep;

// Understands a four sided figure with sides at right angles
public class Rectangle {

    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and length " + length;
    }
}
