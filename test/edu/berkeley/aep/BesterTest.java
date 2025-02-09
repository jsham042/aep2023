package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BesterTest {
    @Test
    public void shouldFindTheBestQuantity() {
        var twoFeet = new ArithmeticQuantity(2, Unit.FOOT);
        var twentySixInches = new ArithmeticQuantity(26, Unit.INCH);
        var oneYard = new ArithmeticQuantity(1, Unit.YARD);
        var bester = new Bester(twoFeet, twentySixInches, oneYard);
        assertEquals(oneYard, bester.best());
    }

    @Test
    public void shouldFindTheBestChance() {
        var dieRoll = new Chance(1/6);
        var coinToss = new Chance(0.5);
        var bester = new Bester(dieRoll, coinToss);
        assertEquals(coinToss, bester.best());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowAnExceptionIfYouPassAnEmptyArray() {
        var bester = new Bester();
        assertNull(bester.best());
    }
}
