// test program for LinkedHashSet
import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
    
        // create a linked hash set
        Set<String> set = new LinkedHashSet<>();

        // add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijin");
        set.add("New York");

        System.out.println(set);

        // display the elements in the hash set
        for (Object element: set)
            System.out.print(element + " ");
    }

}
