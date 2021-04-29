package _1_IteratorObjectEqualityHashCodeAndComparison.Equals;

public class Equality {
    public static void main(String[] args) {

       /*
       //Equality
        The == operator
        //Equality with primitives
        4 == 4
        true == true
         */

        /*
        //Equality with Objects
        The equals() method
        */

        Student student1 = new Student("John","one",1,"Maths");
        Student student2 = new Student("John","one",1,"Maths");

        System.out.println(student1 == student2); //false

        //here its doing reference comparison before implementing equals method in Student class, but we need to compare actual values of the object
        System.out.println(student1.equals(student2));//false

        //here its doing comparison for actual values of the objects after overriding equals method in Student class with student class fields.
        System.out.println(student1.equals(student2));//true


    }

}
