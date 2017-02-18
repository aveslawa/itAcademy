import java.util.Scanner;

/*
 * Created by Viachaslau on 2/17/2017.
 */
public class NextDate {


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = Input.nextShort();

        System.out.println("Введите месяц:");
        int month = Input.nextByte();

        System.out.println("Введите день:");
        int day = Input.nextByte();
        System.out.println("Вывод следующей даты будет доступен позже, а покуда можно увидеть только текущую дату :)");
        System.out.println("День " + day + "  Месяц  " + month + " Год "+ year);

    }

// у меня был план как это сделать, но что-то пошло не так..
/*    public static int formatDate(int day, int month, int year) {
        //add check year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            boolean LeapYear = true;
        } else {
            boolean LeapYear = false;

//add check month
            if (LeapYear == true && month == 2) {
                System.out.println("Висакосный год, февраль");
            }
            {
                switch (month) {
                    case 2:
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        boolean days31 = false;
                        boolean days29 = false;
                        break;
                    default:
                        days31 = true;
                }
            }


        }


    }*/
}
