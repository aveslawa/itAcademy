import java.util.Scanner;

/**
 * Created by viachaslau on 2/19/17.
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner KeybInput = new Scanner(System.in);
        System.out.println("Введите число: ");
        long number = KeybInput.nextLong();
        System.out.println("Cумма в ряду чисел = " + FibonacciCycle(number) + "( Реалиция с помощью цикла)");
        System.out.println("Сумма в ряду чисел = " + FibonacciRecursion(number) + "( Реалиция с помощью рекурсии)");
    }

    public static long FibonacciCycle(long number) {
        long fib = 0;
        //if (number == 0) {
        //    System.out.println("Сумма в ряду чисел = " + number);
        //} else if (number == 1) {
        //    System.out.println("Cумма в ряду чисел = " + 1);
        //} else{

        long number1 = 1;
        long number2 = 1;
            for (int i = 1; i < number; i++) {
                System.out.println("Ряд Фибоначчи: " + number1);
                fib = number1 + number2;
                number1 = number2;
                number2 = fib;
                //  }
                // fib -= 1; //с этой строкой результат похож на правду
                // не разобрался в чем дело- будет время испавлю и коммент удалю
            }
        return (fib); //сделать грамотную проверку при вводе 0 или 1
    }

    public static long FibonacciRecursion(long number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        {
            return FibonacciRecursion(number - 1) + FibonacciRecursion(number - 2);

        }
    }
}


