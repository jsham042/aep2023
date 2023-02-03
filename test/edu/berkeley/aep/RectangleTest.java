package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void rectangleWithSideTwoShouldHaveAreaFour() {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals(4, rectangle.area());
    }

    @Test
    public void rectangleWithSideSixShouldHaveAreaThirtySix() {
        Rectangle rectangle = new Rectangle(6, 6);
        assertEquals(36, rectangle.area());
    }

    @Test
    public void rectangleWithWidthTwoAndLengthFourShouldHavePerimeterTwelve() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(12, rectangle.perimeter());
    }

    @Test
    public void squareWithSideTwoShouldHaveAreaFour() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals(4, square.area());
    }
}
