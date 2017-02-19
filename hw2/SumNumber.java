import java.util.Scanner;

/**
 * Created by viachaslau on 2/19/17.
 */
public class SumNumber {
    public static void main(String[] args) {
        Scanner KeybInput = new Scanner(System.in);
        System.out.println("Введите целое число:");
        long Number = KeybInput.nextLong();
        long result=0;
        while (Number!=0){
            result+=Number%10;
            Number/=10;
        }
        System.out.println("Сумма цифр введеного числа = "+result);
    }
}
