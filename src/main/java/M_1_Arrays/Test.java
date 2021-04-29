package M_1_Arrays;

import M_1_Arrays.ArrayImpl;
import M_1_Arrays.ArrayExec;


public class Test {
    public static void main(String[] args) {
        /*ArrayImpl impl = new ArrayImpl();
        impl.printArray();*/

        ArrayExec exec = new ArrayExec(3);
        exec.insertArrayElements(10);
        exec.insertArrayElements(20);
        exec.insertArrayElements(30);
        exec.insertArrayElements(40);
        exec.insertArrayElements(50);

        System.out.println("Index of the search element is " + exec.indexOf(10));
        System.out.println("Index of the search element is " + exec.indexOf(60));

        exec.removeAt(1);

        exec.printArray();
    }
}
