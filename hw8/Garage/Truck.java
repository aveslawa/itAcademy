package Garage;

/**
 * Created by Viachaslau.
 */
public class Truck extends Car {
    private int weight;

    public Truck(String name, String model, int yearOfIssue, String typeOfDrive, int engineCapacity, String color, int weight) {
        super(name, model, yearOfIssue, typeOfDrive, engineCapacity, color);
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + weight;
        result = 31 * result + getYearOfIssue();
        result = 31 * result + getEngineCapacity();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль, способный перевезти до " + weight + " тонн груза";
    }
}
