package students;

import java.util.Comparator;

/**
 * Created by Viachaslau.
 */

public class ByAverageRatingComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return new Double(firstStudent.getAverageRating()).compareTo(secondStudent.getAverageRating());
    }
}
