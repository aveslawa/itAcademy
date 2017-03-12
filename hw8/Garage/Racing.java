package Garage;

/**
 * Created by Viachaslau.
 */
public class Racing extends Car {
    private int accelerationTo100;

    public Racing(String name, String model, int yearOfIssue, String typeOfDrive, int engineCapacity, String color, int accelerationTo100) {
        super(name, model, yearOfIssue, typeOfDrive, engineCapacity, color);
        this.accelerationTo100 = accelerationTo100;
    }

    public double getAccelerationTo100() {
        return accelerationTo100;
    }

    public void setAccelerationTo100(int accelerationTo100) {
        this.accelerationTo100 = accelerationTo100;
    }

    @Override
    public String toString() {
        return "Спортивный автомобиль с разгоном до \"сотни\" за " + accelerationTo100 + " мс";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Racing racing = (Racing) o;

        return Double.compare(racing.getAccelerationTo100(), getAccelerationTo100()) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + accelerationTo100;
        result = 31 * result + getYearOfIssue();
        result = 31 * result + getEngineCapacity();
        return result;
    }

}

