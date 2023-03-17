package edu.berkeley.aep;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ChanceTest {
    @Test
    public void chanceObjectsShouldBeValueObjects() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        assertEquals(anotherCoinToss, coinToss);
    }

    @Test
    public void notOfCoinTossShouldBeACoinToss() {
        Chance coinToss = new Chance(0.5);
        Chance anotherCoinToss = new Chance(0.5);
        assertEquals(anotherCoinToss, coinToss.not());
    }

    @Test
    public void probabilityOfTwoCoinTossesBothBeingHeadsShouldBeOneQuarter() {
        Chance coinToss = new Chance(0.5);
        Chance probabilityOfTwoHeads = new Chance(0.25);
        assertEquals(probabilityOfTwoHeads, coinToss.and(coinToss));
    }

    @Test
    public void probabilityOfTwoCoinTossesYieldingAtLeastOneHeadShouldBeThreeQuarters() {
        Chance coinToss = new Chance(0.5);
        Chance probabilityOfAtLeastOneHead = new Chance(0.8);
        assertEquals(probabilityOfAtLeastOneHead, coinToss.or(coinToss));
    }

    @Test
    public void shouldHaveAHashCode() {
        Map<Chance, String> map = new HashMap<>();
        map.put(new Chance(0.5), "Coin Toss");
        assertEquals("Coin Toss", map.get(new Chance(0.5)));
    }


}
