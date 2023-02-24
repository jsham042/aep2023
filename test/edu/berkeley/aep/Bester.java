package edu.berkeley.aep;

// Understands how to find the biggest out of the supplied objects
public class Bester {
    private final ScaledQuantity[] quantities;

    public Bester(ScaledQuantity... quantities) {
        if (quantities.length < 1) {
            throw new RuntimeException("At least one quantity required");
        }
        this.quantities = quantities;
    }

    public ScaledQuantity best() {
        var best = quantities[0];
        for (var quantity: quantities) {
            if (quantity.betterThan(best)) {
                best = quantity;
            }
        }
        return best;
    }
}
