package triangle;

public class TriangleHole implements Triangle{

    private double height;

    public TriangleHole(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public boolean fits(TrianglePeg peg) {

        return this.getHeight() >= peg.getHeight();
    }
}
