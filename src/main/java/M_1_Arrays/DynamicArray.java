package M_1_Arrays;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        list.remove(0);
        list.indexOf(20);
        list.lastIndexOf(20);
        list.contains(30);
        list.size();
        list.toArray();
        System.out.println(list);
    }
}
