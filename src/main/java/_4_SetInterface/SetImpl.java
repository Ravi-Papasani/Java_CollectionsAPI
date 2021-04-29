package _4_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("name D");
        names.add("name B");
        names.add("name C");
        names.add("name A");
        //default order is no specific order
        System.out.println(names); //[name D, name C, name B, name A]

        names.add("name A");
        boolean result = names.add("name A");
        //duplicates insertion not allowed
        System.out.println(names); //[name D, name C, name B, name A]
        System.out.println(result); //false

        names.remove("name B");
        //removes element "B"
        System.out.println(names); //[name D, name C, name A]

        //check if element exists or not
        System.out.println(names.contains("name D")); //true



    }
}
