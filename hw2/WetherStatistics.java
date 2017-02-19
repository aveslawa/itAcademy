import java.util.Scanner;

/**
 * Created by Viachaslau on 2/19/2017.
 */
public class WetherStatistics {
    public static void main(String[] args) {
        Scanner KeybInput = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int day = KeybInput.nextInt();
        int Sum=0;

        for (int i=1; i<=day; i++){
            System.out.println("Введите количество осадков для дня №"+i);
            int precip = KeybInput.nextInt();
            Sum+=precip;
        }
        System.out.println("Статистика по осадкам за период = " +day +" дней");
        //здесь же не стоял вопрос о правильном формате вывода: день, дня, дней?
        System.out.println("Сумма осадков за указанный  период = " +Sum + " мм");
        System.out.println("Cреднее количество осадков за период = " + (Sum/day)+ " мм");
        // с "Максимальное количество дневных осадков за этот период" - не совсем понял, что требовалось сделать
    }

}
