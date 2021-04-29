package _1_IteratorObjectEqualityHashCodeAndComparison.Iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        //Adding elements to array list of String type
        for (int i = 0; i < 10; i++){
            names.add("name" + i);
        }

        //Printing elements from the array list
        for (int i = 0; i < 10; i++){
            System.out.println(names.get(i));
        }

        //Printing all the elements in the array list using Iterator
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //for-each loop
        for(String name: names){
            System.out.println(name);
        }

        //Retrieving element based on index
        names.indexOf("name 5");
    }
}
