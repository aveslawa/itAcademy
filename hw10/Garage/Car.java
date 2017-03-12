package Garage;

/**
 * Created by Viachaslau.
 */
public abstract class Car {
    private String name;
    private String model;
    private int yearOfIssue;
    private String typeOfDrive;
    private int engineCapacity;
    private String color;

    public Car(String name, String model, int yearOfIssue, String typeOfDrive, int engineCapacity, String color) {
        this.name = name;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.typeOfDrive = typeOfDrive;
        this.engineCapacity = engineCapacity;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
