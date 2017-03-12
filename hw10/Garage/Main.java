package Garage;

/**
 * Created by Viachaslau.
 */
public class Main {
    public static void main(String[] args) {

        Car busTypeOne = new Bus("Школьный", "МАЗ-256", 2009, "Задний", 5, "Жёлтенький", 28);
        Car busTypeTwo = new Bus("Городской", "МАЗ-256", 2006, "Задний", 3, "Жёлтенький", 28);
        Car busTypeThee = new Bus("Городской", "МАЗ-226", 2007, "Задний", 5, "Зеленый", 31);
        Car truckTypeOne = new Truck("Тягач", "МАЗ-6440", 2008, "Полный", 7, "Красный", 25);
        Car autoTypeOne = new Auto("Хонда", "Аккорд", 2014, "Полный", 4, "Белый", "Купе");
        Car racingTypeOne = new Racing("Бугатти", "Вейрон", 2015, "Полный", 8, "Синий", 3100);


        Garage garage = new Garage();
        //паркуем
        garage.parking(busTypeOne, 4);
        garage.parking(busTypeTwo, 5);
        garage.parking(busTypeOne, 2);
        garage.parking(racingTypeOne, 11);
        garage.parking(autoTypeOne, 2);
        garage.parking(truckTypeOne, 5);

        //выезжаем
        garage.exitForTheCar(busTypeOne, 4);
        garage.exitForTheCar(racingTypeOne, 1);
        garage.exitForTheCar(truckTypeOne, 6);
        garage.exitForTheCar(autoTypeOne, 1);

        //смотрим
        garage.getTypeCar(busTypeOne);
        garage.getTypeCar(busTypeTwo);
        garage.getTypeCar(truckTypeOne);
        garage.getTypeCar(racingTypeOne);
        garage.getTypeCar(autoTypeOne);


    }
}
