package _1_IteratorObjectEqualityHashCodeAndComparison.ObjectOrderingUsingComparableInterface;

import _1_IteratorObjectEqualityHashCodeAndComparison.ObjectOrderingUsingComparableInterface.Student;

import java.util.ArrayList;

public class ObjOrder {
    public static void main(String[] args) {

        /*
        //Comparison of primitives
        3 > 2

        //Sorting in primitives
        [7,5,9] -> [5,7,9]

        //Comparison of Objects
        1. There's object state in objA and objB
        2. There is a clear definition of comparison of those values
        3. Individual values or combination of values
        4. we can not compare objects like DB connections etc..

        //The Comparable interface
        indicates that an object is comparable

        //Sorting with Objects
        [Obj1,Obj3,Obj2] -> implementing Comparable interface by overriding the compareTo method in Student class
        */

        Student student1 = new Student("John","one",1,"Maths");
        Student student3 = new Student("Jay","three",3,"Science");
        Student student2 = new Student("Joseph","two",2,"Arts");

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(student2);
        allStudents.add(student1);
        allStudents.add(student3);

        allStudents.sort(null);

        System.out.println(allStudents); // Objects are sorted now based on id, as we override and implemented compareTo Method using "id"

    }
}
