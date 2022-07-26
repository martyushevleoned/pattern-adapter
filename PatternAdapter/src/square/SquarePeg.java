package square;

public class SquarePeg implements Square {

    private double width;

    public SquarePeg() {
    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
