package round;

public class RoundHole implements Round {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {

        return this.getRadius() >= peg.getRadius();
    }
}
