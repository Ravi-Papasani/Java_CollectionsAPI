package _3_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("C");
        names.add("B");
        //default order is insertion order
        System.out.println(names); //[A, C, B]

        names.add("A");
        //Allows duplicates
        System.out.println(names); //[A, C, B, A]

        names.set(2,"D");
        //replace element at position 2 with "D"
        System.out.println(names); //[A, C, D, A]

        names.add(2,"E");
        //insert element "E" at position 2
        System.out.println(names); //[A, C, E, D, A]

        names.remove(2);
        //removes element at index 2
        System.out.println(names); //[A, C, D, A]

        names.remove("A");
        //removes first element "A" from the list
        System.out.println(names); //[C, D, A]

        names.remove("A");
        //removes next element A from the list
        System.out.println(names); //[C, D]

        //get first index element on the list
        System.out.println(names.get(1)); //C

        //IndexOutOfBounds Exception
        //System.out.println(names.get(21));





    }
}
