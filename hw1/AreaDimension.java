import java.util.Scanner;

/**
 * Created by Viachaslau on 2/17/2017.
 */
public class AreaDimension {
    public static void main(String[] args) {
        Scanner KeybIn = new Scanner(System.in);

        System.out.println("Введите ширину участка:");
        int SideE1 = KeybIn.nextInt();
        System.out.println("Введите длину участка:");
        int SideF1 = KeybIn.nextInt();

        System.out.println("Введите ширину первого дома:");
        int SideA1 = KeybIn.nextInt();
        System.out.println("Введите длину первого дома:");
        int SideB1 = KeybIn.nextInt();

        System.out.println("Введите ширину второго дома:");
        int SideC1 = KeybIn.nextInt();
        System.out.println("Введите длину второго дома:");
        int SideD1 = KeybIn.nextInt();
        //Согласен, что не самое лучшее и изящное решение, но покуда так:)
        int length1 = SideA1 + SideC1;
        int length2 = SideB1 + SideD1;
        int width1 = SideA1 + SideD1;
        int width2 = SideB1 + SideC1;
        //количество записей можно сократить, но когда я писал - не знал как, а теперь у меня нет времени править
        //главное, что оно работает:)
        if (SideE1 < length1) {
            System.out.println("Дома не помещаются на выбранную площадку!");
            } else if (SideE1 < length2) {
            System.out.println("Дома не помещаются на выбранную площадку!");
            }else if (SideE1 < width1) {
                System.out.println("Дома не помещаются на выбранную площадку!");
            } else if (SideE1 < width2) {
                System.out.println("Дома не помещаются на выбранную площадку!");
            } else if (SideF1 < length1) {
                System.out.println("Дома не помещаются на выбранную площадку!");
            } else if (SideF1 < length2) {
            System.out.println("Дома не помещаются на выбранную площадку!");
            }else if (SideF1 < width1) {
                    System.out.println("Дома не помещаются на выбранную площадку!");
            } else if (SideF1 < width2) {
                    System.out.println("Дома не помещаются на выбранную площадку!");
        } else {
                    System.out.printf("Дома помещаются на выбранную площадку!");
                }
            }
        }

