import adapter.RoundToSquarePegAdapter;
import adapter.RoundToTrianglePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquareHole;
import square.SquarePeg;
import triangle.TriangleHole;
import triangle.TrianglePeg;

public class Main {
    public static void main(String[] args) {

        // первоначальный функционал
        // круглый колышек помещается в круглое отверстие
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("roundPeg fits  in roundHole: " + roundHole.fits(roundPeg));

        /// треугольный колышек помещается в треугольное отверстие
        SquareHole squareHole = new SquareHole(5);
        SquarePeg squarePeg = new SquarePeg(5);
        System.out.println("squarePeg fits in squareHole: " + squareHole.fits(squarePeg));

        // треугольный колышек помещается в треугольное отверстие
        TriangleHole triangleHole = new TriangleHole(5);
        TrianglePeg trianglePeg = new TrianglePeg(5);
        System.out.println("trianglePeg fits in triangleHole: " + triangleHole.fits(trianglePeg));
        System.out.println();


        // надстройки в виде адаптеров
        // круглый колышек помещается в треугольное отверстие
        RoundToSquarePegAdapter roundToSquarePegAdapter = new RoundToSquarePegAdapter(roundPeg);
        System.out.println("roundToSquarePegAdapter fits in squareHole: " + squareHole.fits(roundToSquarePegAdapter));

        // круглый колышек помещается в треугольное отверстие
        RoundToTrianglePegAdapter roundToTrianglePegAdapter = new RoundToTrianglePegAdapter(roundPeg);
        System.out.println("roundToTrianglePegAdapter fits in triangleHole: " + triangleHole.fits(roundToTrianglePegAdapter));

    }
}