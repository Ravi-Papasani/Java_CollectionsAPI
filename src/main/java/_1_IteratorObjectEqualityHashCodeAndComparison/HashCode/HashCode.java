package _1_IteratorObjectEqualityHashCodeAndComparison.HashCode;

import _1_IteratorObjectEqualityHashCodeAndComparison.HashCode.Student;

public class HashCode {
    public static void main(String[] args) {

        Student student1 = new Student("John","one",1,"Maths");
        Student student2 = new Student("John","one",1,"Maths");

        //Before implementing HashCode method in Student class
        System.out.println(student1.hashCode()); //1057941451
        System.out.println(student2.hashCode()); //1975358023

        //After implementing HashCode method in Student class
        System.out.println(student1.hashCode()); //412955205
        System.out.println(student2.hashCode()); //412955205

    }
}
