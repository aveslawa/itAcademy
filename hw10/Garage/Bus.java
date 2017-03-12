package Garage;

/**
 * Created by Viachaslau.
 */
public class Bus extends Car {
    private int numberOfSeats;

    public Bus(String name, String model, int yearOfIssue, String typeOfDrive, int engineCapacity, String color, int numberOfSeats) {
        super(name, model, yearOfIssue, typeOfDrive, engineCapacity, color);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "Автомобиль " + getYearOfIssue() + " г/в для перевозки людей с количеством пассажирских мест до " + numberOfSeats + " (автобус)";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return getNumberOfSeats() == bus.getNumberOfSeats();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + numberOfSeats;
        result = 31 * result + getYearOfIssue();
        result = 31 * result + getEngineCapacity();
        return result;
    }
}

