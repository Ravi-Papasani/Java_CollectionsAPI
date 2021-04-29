package _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator;

import java.util.ArrayList;
import java.util.Collections;

import _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator.Student;
import _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator.AgeComparator;
import _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator.FirstNameComparator;


public class CustomCompImpl {
    public static void main(String[] args) {
        Student student1 = new Student("John","one",28, 1,"Maths");
        Student student3 = new Student("Alex","three",25,3,"Science");
        Student student2 = new Student("Rob","two",26, 2, "Arts");

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student3);
        allStudents.add(student2);

        System.out.println("Sorting by FirstName");

        //Collections.sort(allStudents, new FirstNameComparator());
        allStudents.sort(new FirstNameComparator());
        System.out.println(allStudents);


        System.out.println("Sorting by Age");

        Collections.sort(allStudents, new AgeComparator());
        //allStudents.sort(new AgeComparator());
        for (Student stu: allStudents){
            System.out.println(stu.getFirstName() + " __ " + stu.getDepartment() + " __ " + stu.getAge());
        }

    }
}
