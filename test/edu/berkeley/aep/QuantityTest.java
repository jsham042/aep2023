package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {

    @Test
    public void oneFootShouldEqualTwelveInches() {
        var oneFoot = new Quantity(1, Unit.FOOT);
        var twelveInches = new Quantity(12, Unit.INCH);
        assertEquals(oneFoot, twelveInches);
    }

    @Test
    public void oneYardShouldEqualThreeFeet() {
        var oneYard = new Quantity(1, Unit.YARD);
        var threeFeet = new Quantity(3, Unit.FOOT);
        assertEquals(oneYard, threeFeet);
    }

    @Test
    public void oneMileShouldEqual1760Yards() {
        var oneMile = new Quantity(1, Unit.MILE);
        var oneMileInYards = new Quantity(1760, Unit.YARD);
        assertEquals(oneMile, oneMileInYards);
    }

    @Test
    public void oneTbspShouldEqualThreeTsp() {
        var oneTbsp = new Quantity(1, Unit.TBSP);
        var threeTsp = new Quantity(3, Unit.TSP);
        assertEquals(oneTbsp, threeTsp);
    }

    @Test
    public void oneOzShouldEqualTwoTbsp() {
        var oneTbsp = new Quantity(1, Unit.OZ);
        var twoTbsp = new Quantity(2, Unit.TBSP);
        assertEquals(oneTbsp, twoTbsp);
    }

    @Test
    public void eightOzShouldEqualOneCup() {
        var oneOz = new Quantity(8, Unit.OZ);
        var oneCup = new Quantity(1, Unit.CUP);
        assertEquals(oneOz, oneCup);
    }

    @Test
    public void twoInchesPlusTwoInchesShouldEqualFourInches() {
        var twoInches = new Quantity(2, Unit.INCH);
        var fourInches = new Quantity(4, Unit.INCH);
        assertEquals(fourInches, twoInches.add(twoInches));
    }

    @Test
    public void twoTablespoonsPlusOneOzShouldEqualTwelveTeaspoons() {
        var twoTablespoons = new Quantity(2, Unit.TBSP);
        var oneOz = new Quantity(1, Unit.OZ);
        var twelveTeaspoons = new Quantity(12, Unit.TSP);
        assertEquals(twelveTeaspoons, twoTablespoons.add(oneOz));
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotBeAbleToAddFeetAndTeaspoons() {
        var oneFoot = new Quantity(1, Unit.FOOT);
        var oneTeaspoon = new Quantity(1, Unit.TSP);
        assertEquals(oneFoot, oneFoot.add(oneTeaspoon));
    }

    @Test
    public void oneHundredCelsiusShouldEqual212F() {
        var oneHundredCelsius = new Quantity(100, Unit.CELSIUS);
        var twoHundredTwelveFahrenheit = new Quantity(212, Unit.FAHRENHEIT);
        assertEquals(oneHundredCelsius, twoHundredTwelveFahrenheit);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        var zeroCelsius = new Quantity(0, Unit.CELSIUS);
        var thirtyTwoFahrenheit = new Quantity(32, Unit.FAHRENHEIT);
        assertEquals(thirtyTwoFahrenheit, zeroCelsius);
    }
}
