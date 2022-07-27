package adapter;

import round.RoundPeg;
import square.Square;
import square.SquarePeg;

public class RoundToSquarePegAdapter extends SquarePeg implements Square {

    private RoundPeg roundPeg;

    public RoundToSquarePegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    @Override
    public double getWidth() {
        // переопределяем ширину квадрата как 2 радиуса круга потому что геометрия
        return roundPeg.getRadius() * 2;
    }
}
