import java.util.Scanner;

/**
 * Created by Viachaslau on 2/25/2017.
 */

public class RomanToArabicNum {

    public static boolean stringIsRomanNumber(String romanNumber) {
        if (0 < romanNumber.length() & romanNumber.matches("[IiVvXxLlCcDdMm]*")) {
            return true;
        }
        return false;
    }

    public static int romanDigitToArabic(char romanDigit) {
        switch (romanDigit) {
            case 'I':
            case 'i':
                return 1;
            case 'V':
            case 'v':
                return 5;
            case 'X':
            case 'x':
                return 10;
            case 'L':
            case 'l':
                return 50;
            case 'C':
            case 'c':
                return 100;
            case 'D':
            case 'd':
                return 500;
            case 'M':
            case 'm':
                return 1000;
            default:
                return -1;
        }


    }

    public static int convertRomanNumberToArabic(String romanNumber) {
        int arabicSum = 0;
        int romanLength = romanNumber.length();
        for (int i = 0; i < romanLength; i++) {
            int arabicDelta;
            int romanDigitValue = romanDigitToArabic(romanNumber.charAt(i));
            if (i == (romanLength - 1)) {
                arabicDelta = romanDigitValue;
            } else {
                int romanDigitValueNext = romanDigitToArabic(romanNumber.charAt(i + 1));
                if (romanDigitValue < romanDigitValueNext) {
                    arabicDelta = romanDigitValueNext - romanDigitValue;
                    i++;
                } else {
                    arabicDelta = romanDigitValue;
                }
            }
            arabicSum += arabicDelta;
        }
        return arabicSum;
    }

    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String romanNumber = inputKey.next();
        int arabicNumber;

        System.out.println("Соответствующее число в десятичном формате = " + convertRomanNumberToArabic(romanNumber));

    }

}



