package M_1_Arrays;

public class ArrayExec {

    private int[] items;
    private int count;

    public ArrayExec(int length) {
        items = new int[length];
    }

    public void insertArrayElements(int item) {
        //if the Array is full, resize it
        if (items.length == count) {
            //create a new array (twice the size)
            int[] newItems;
            newItems = new int[count * 2];
            //copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            //set the "items" to this new array
            items = newItems;
        }
        //Add the new item at the end
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        //Validating the index presence
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        //shift the array items to the left to fill the deleted element using index
        /*
        [10,20,30,40]
        index: 1 removed, then move elements to the left
        1 filled with <- 2
        2 <- 3
        after moving elements to remove the last element [10,30,40,0]
        decrement the count by one
        count--
        then elements are [10,30,40]
        */
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int searchElement) {
        //if element found return 1
        for (int i = 0; i < count; i++) {
            if (items[i] == searchElement)
                return i;

        }
        // if element not found return negative value
        return -1;
    }


    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
