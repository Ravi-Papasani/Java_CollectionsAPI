package _1_IteratorObjectEqualityHashCodeAndComparison.CustomComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CustomCompImplJava8 {
    public static void main(String[] args) {
        Student student1 = new Student("John","one",28, 1,"Maths");
        Student student3 = new Student("Alex","three",25,3,"Science");
        Student student2 = new Student("Rob","two",26, 2, "Arts");

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(student1);
        allStudents.add(student3);
        allStudents.add(student2);

        //Sorting elements on the basis of Student FirstName
        Comparator<Student> compFirstName = Comparator.comparing(Student::getFirstName);
        Collections.sort(allStudents,compFirstName);
        System.out.println("Sorting by FirstName");
        for(Student stu: allStudents){
            System.out.println(stu.getFirstName() +"__ "+ stu.getLastName() + "__ " + stu.getAge());
        }

        //Sorting elements on the basis of Student Age
        Comparator<Student> compAge = Comparator.comparing(Student::getAge);
        Collections.sort(allStudents,compAge);
        System.out.println("Sorting by Age");
        for(Student stu: allStudents){
            System.out.println(stu.getAge() +"__ "+ stu.getFirstName() + "__ " + stu.getLastName());
        }
    }
}
