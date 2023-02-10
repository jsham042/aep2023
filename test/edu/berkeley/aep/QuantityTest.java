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
}
