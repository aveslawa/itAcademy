package students;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Viachaslau.
 */
public class SchoolJournal {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Анатолий", "Петров", 16, 8.19));
        students.add(new Student("Федор", "Иванов", 15, 7.84));
        students.add(new Student("Петр", "Сидоров", 17, 5.0));
        students.add(new Student("Алексей", "Пупкин", 16, 6.21));
        students.add(new Student("Иван", "Шурупкин", 14, 9.89));

        maxAverageRating(students);

        System.out.println("Сортировка учеников по полному имени: ");
        sortByFullName(students);

        System.out.println("Сортировка учеников по возрасту: ");
        sortByAge(students);

        System.out.println("Сортировка учеников по среднему баллу за год: ");
        sortByAverageRating(students);

        System.out.println("Сортировка по возрасту и среднему баллу за год: ");
        sortByAgeAndAverageRating(students);

    }

    private static void maxAverageRating(List<Student> students) {

        Iterator<Student> iterator = students.iterator();
        Student maxAverageRating = iterator.next();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageRating() > maxAverageRating.getAverageRating()) {
                maxAverageRating = student;
            }
        }
        System.out.println("Ученик " + maxAverageRating.getFullName() + " получил самый высокий средний балл = " + maxAverageRating.getAverageRating());

    }

    private static void sortByFullName(List<Student> students) {
        Collections.sort(students, new ByFullNameComparator());

        for (Student student : students) {
            System.out.println(student.getFullName());

        }
    }

    private static void sortByAge(List<Student> students) {
        Collections.sort(students, new ByAgeComparator());

        for (Student student : students) {
            System.out.println(student.getFullName() + " отпраздновал " + student.getAge() + " дней Рождения");

        }
    }

    private static void sortByAverageRating(List<Student> students) {
        Collections.sort(students, new ByAverageRatingComparator());

        for (Student student : students) {
            System.out.println(student.getFullName() + " получил средний балл за год = " + student.getAverageRating());
        }
    }

    private static void sortByAgeAndAverageRating(List<Student> students) {
        Collections.sort(students, new ByAgeAndAverageRatingComparator());

        for (Student student : students) {
            System.out.println(student.getFullName() + ", возраст " + student.getAge() + " лет " + ", средний балл за год = " + student.getAverageRating());
        }
    }
}
