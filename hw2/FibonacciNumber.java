import java.util.Scanner;

/**
 * Created by viachaslau on 2/19/17.
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = input.nextLong();
        System.out.println("Cумма в ряду чисел = " + cycle(number) + "( Реалиция с помощью цикла)");
        System.out.println("Сумма в ряду чисел = " + recursion(number) + "( Реалиция с помощью рекурсии)");
    }

    public static long cycle(long number) {
        long fib = 0;
        long number1 = 1;
        long number2 = 1;
            for (int i = 1; i < number; i++) {
                System.out.println("Ряд Фибоначчи: " + number1);
                fib = number1 + number2;
                number1 = number2;
                number2 = fib;

                // fib -= 1; //с этой строкой результат похож на правду
                // не разобрался в чем дело- будет время испавлю и коммент удалю
            }
        return (fib);
    }

    public static long recursion(long number) {
        if (number == 0 || number == 1) {
            return 1;
        }
                    return recursion(number - 1) + recursion(number - 2);
    }
}
