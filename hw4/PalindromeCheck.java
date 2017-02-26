/**
 * Created by Viachaslau on 2/25/2017.
 */
public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Введите палиндром:");
        String string = inputKey.next();

        if (palindromeCheck(string)) {
            System.out.println("Введённая строка является палиндромом.");
        } else {
            System.out.println("Введённая строка не является палиндромом.");
        }
    }

    public static boolean palindromeCheck(String string) {
        StringBuilder builder = new StringBuilder(string);
        StringBuilder builderTemp = new StringBuilder(string);
        return builderTemp.toString().equals(builder.reverse().toString());
    }

}
