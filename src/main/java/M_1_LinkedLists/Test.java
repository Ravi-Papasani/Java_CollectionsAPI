package M_1_LinkedLists;

public class Test {
    public static void main(String[] args) {
        //LinkedList list = new LinkedList();
        var list = new LinkedList();
        //test addLast Method Implementation
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        //test indexOf method
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(20)); //1
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(40));

        //test contains method
        System.out.println(list.contains(10));
        System.out.println(list.contains(50));

        //test removeFirst
        list.removeFirst();
        System.out.println(list.indexOf(20)); //0

        //test removeLast
        list.removeLast();
        System.out.println(list.indexOf(30));

    }
}
