package adapter;

import round.RoundPeg;
import square.Square;
import square.SquarePeg;

public class RoundPegAdapter extends SquarePeg implements Square {

    private RoundPeg roundPeg;

    public RoundPegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    @Override
    public double getWidth() {
        return roundPeg.getRadius() * 2;
    }
}
