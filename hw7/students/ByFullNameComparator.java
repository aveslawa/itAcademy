package students;

import java.util.Comparator;

/**
 * Created by Viachaslau.
 */

public class ByFullNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getFullName().compareTo(secondStudent.getFullName());
    }
}
