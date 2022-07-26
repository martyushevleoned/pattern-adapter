package adapter;

import round.Round;
import round.RoundPeg;
import square.SquarePeg;

public class SquarePegAdapter extends RoundPeg implements Round {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(2) * squarePeg.getWidth() / 2;
    }
}
