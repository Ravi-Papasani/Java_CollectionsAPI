package _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator;

import java.util.Comparator;
import _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator.Student;

//Objects Age Sorting or comparison using Comparator interface implementation
public class AgeComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        //if the comparing field is int use below.
       /*
        if(o1.getAge() == o2.getAge()) return 0;
        else if(o1.getAge() > o2.getAge()) return 1;
        else if(o1.getAge() < o2.getAge()) return -1;
        Above three lines of code can be replace using o1.getAge() - o2.getAge()
        */

        return o1.getAge() - o2.getAge();
    }
}
