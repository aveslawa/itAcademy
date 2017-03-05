package students;

import java.util.Comparator;

/**
 * Created by Viachaslau.
 */

public class ByAgeAndAverageRatingComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        if (firstStudent.getAge() == secondStudent.getAge()) {
            return new ByAverageRatingComparator().compare(firstStudent, secondStudent);
        }
        return new Integer(firstStudent.getAge()).compareTo(secondStudent.getAge());
    }
}
