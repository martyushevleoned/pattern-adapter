import adapter.RoundPegAdapter;
import adapter.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquareHole;
import square.SquarePeg;

public class Main {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        SquareHole squareHole = new SquareHole(5);

        // первоначальный функционал
        // круглый колышек помещается в круглое отверстие
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Round peg radius: " + roundPeg.getRadius());
        System.out.println("Round hole radius: " + roundHole.getRadius());
        System.out.println("Round peg fits in round hole: " + roundHole.fits(roundPeg));
        System.out.println();

        // квадратный колышек помещается в квадратное отверстие
        SquarePeg squarePeg = new SquarePeg(5);
        System.out.println("Square peg width: " + squarePeg.getWidth());
        System.out.println("Square Hole width: " + squareHole.getWidth());
        System.out.println("Square peg fits in square hole: " + squareHole.fits(squarePeg));
        System.out.println();

        // надстройки в виде адаптеров
        // чтобы вставить круглый колышек в квадратное отверстие:
        // создаём адаптер который наследуется от квадратного колышка и реализует его интерфейс
        // переопределяем метод getWidth() как 2 радиуса т.е. максимальную ширину квадратного отверстия куда поместится колышек
        RoundPegAdapter roundPegAdapter = new RoundPegAdapter(roundPeg);
        System.out.println("Round peg adapter width: " + roundPegAdapter.getWidth());
        System.out.println("Square Hole width: " + squareHole.getWidth());
        System.out.println("Round peg adapter fits in square hole: " + squareHole.fits(roundPegAdapter));
        System.out.println();

        // чтобы вставить квадратный колышек в круглое отверстие:
        // аналогично наследуем адаптер от круглого колышка
        // переопределяем метод getRadius()
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println("Square peg adapter radius: " + squarePegAdapter.getRadius());
        System.out.println("Round hole radius: " + roundHole.getRadius());
        System.out.println("Square peg adapter fits in round hole: " + roundHole.fits(squarePegAdapter));
    }
}