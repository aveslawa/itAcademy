import java.util.Scanner;

/**
 * Created by viachaslau on 2/19/17.
 */
public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        long number = input.nextLong();
        long result=0;
        while (number !=0){
            result+= number %10;
            number /=10;
        }
        System.out.println("Сумма цифр введеного числа = "+result);
    }
}
