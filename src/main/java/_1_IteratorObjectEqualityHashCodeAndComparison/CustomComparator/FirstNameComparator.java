package _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator;

import java.util.Comparator;
import _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator.Student;

//Objects FirstName Sorting or comparison using Comparator interface implementation
public class FirstNameComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        //if the comparing field is String use compareTo method.
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
