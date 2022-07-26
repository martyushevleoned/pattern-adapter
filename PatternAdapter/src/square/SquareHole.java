package square;

public class SquareHole implements Square{

    private double width;

    public SquareHole(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public boolean fits(SquarePeg peg) {

        return this.getWidth() >= peg.getWidth();
    }
}
