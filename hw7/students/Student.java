package students;

/**
 * Created by Viachaslau.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageRating;

    public Student(String firstName, String lastName, int age, double averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageRating = averageRating;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
