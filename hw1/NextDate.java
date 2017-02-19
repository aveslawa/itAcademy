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
        //System.out.println("Вывод следующей даты будет доступен позже, а покуда можно увидеть только текущую дату :)");
        //System.out.println("День " + day + "  Месяц  " + month + " Год " + year);

        formatDate(day, month, year);
    }

    public static int formatDate(int day, int month, int year) {
        //add check year
        boolean LeapYear=true;
        boolean days29=true;
        boolean days31=true;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            LeapYear = true;
        } else { LeapYear =false};



            switch (month) {
                case 2:
                case 4:
                case 6:
                case 9:
                case 11:
                    days31 = false;
                    days29 = false;
                    break;
                default:
                    days31 = true;
            }
            System.out.println("Год висакосный?" + LeapYear);
            System.out.println("В феврале 29 дней?" +days29);
            System.out.println("В этом месяце 31 день?" +days31);
        }



        return 0;
    }
}
