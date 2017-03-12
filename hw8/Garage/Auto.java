package Garage;

/**
 * Created by Viachaslau.
 */
public class Auto extends Car {
    private String bodyType;

    public Auto(String name, String model, int yearOfIssue, String typeOfDrive, int engineCapacity, String color, String bodyType) {
        super(name, model, yearOfIssue, typeOfDrive, engineCapacity, color);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + 10001;
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
        return "Легковой автомобиль с кузовом типа " + bodyType;
    }
}
