// Program tests Iterators for collections
import java.util.*;

public class TestIterator {

    public static void main(String[] args) {

	Collection<String> collection = new ArrayList<>();
	collection.add("New York");
	collection.add("Atlanta");
	collection.add("Dallas");
	collection.add("Madison");
	
	// using iterator
	Iterator<String> iterator = collection.iterator();
	while (iterator.hasNext()) {
	    System.out.print(iterator.next().toUpperCase() + " ");
	}
	System.out.println("\n");

	// using foreach loop
	for (String element: collection)
	    System.out.print(element.toUpperCase() + " ");
    }

}
