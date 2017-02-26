package Main;

/**
 * Created by Viachaslau on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point(10, 5);
        Point pointTwo = new Point(10, 20);
        Point pointThree = new Point(25, 20);
        Point pointFour = new Point(25, 5);

        Rectangle rectangle = new Rectangle(pointTwo, pointFour);
        System.out.println("Площадь прямоугольника = " + rectangle.calcOfArea());
        System.out.println("Длина диагонали прямоугольника = " + rectangle.calcOfDiagonal());

    }
}
