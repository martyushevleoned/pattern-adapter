package adapter;

import round.RoundPeg;
import triangle.Triangle;
import triangle.TrianglePeg;

public class RoundToTrianglePegAdapter extends TrianglePeg implements Triangle {

    private RoundPeg roundPeg;

    public RoundToTrianglePegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    @Override
    public double getHeight() {
        // переопределяем ширину квадрата как 3 радиуса
        // тк высота треугольника в 3 раза больше расстояния от центра до стороны треугольника
        return roundPeg.getRadius() * 3;
    }
}
