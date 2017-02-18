import java.util.Scanner;
/**
 * Created by Viachaslau on 2/17/2017.
 *
 * Быстрый подбор коэфф. для проверки:
 * d=0 при а=1, b=2, c=1
 * d=IsNeg при a=1, b=0, c=1
 * d=IsPos при a=1, b=5, c=6
 */
public class Quadratic {

    public static void main(String[] args) {
        Scanner KeybIn = new Scanner(System.in);

        System.out.println("Введите коэффициент А:");
        double a = KeybIn.nextDouble();
        System.out.println("Введите коэффициент B:");
        double b = KeybIn.nextDouble();
        System.out.println("Введите коэффициент C:");
        double c = KeybIn.nextDouble();
        discriminant(a, b, c);
        double d = discriminant(a, b, c);
        System.out.println("Дискриминант квадратного уравнения = " + d);


        if (isPositive(d) == true) {

            System.out.println("Первый корень уравнения  = " + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("Второй корень уравнения  = " + (-b - Math.sqrt(d)) / (2 * a));
        } else if (isZero(d) == true) {
            System.out.println("Корень уравнения = " + (-b / (a * 2)));
        } else {
            System.out.println("Корней не существует!");
        }
    }

    public static boolean isPositive(double number) {
        boolean isPositive;
        if (number > 0) {
            return (isPositive = true);
        } else {
            return (isPositive = false);
        }
    }

    public static boolean isZero(double number) {
        boolean isZero;
        if (number == 0) {
            return (isZero = true);
        } else {
            return (isZero = false);
        }
    }

    public static double discriminant(double a, double b, double c) {
        double d = (b * b) - (4 * a * c);
        return d;
    }
    }

