package edu.berkeley.aep;

// Understands how to find the biggest out of the supplied objects
public class Bester {
    private final Bestable[] bestables;

    public Bester(Bestable... bestables) {
        if (bestables.length < 1) {
            throw new RuntimeException("At least one quantity required");
        }
        this.bestables = bestables;
    }

    public Bestable best() {
        var best = bestables[0];
        for (var challenger: bestables) {
            if (challenger.betterThan(best)) {
                best = challenger;
            }
        }
        return best;
    }
}
