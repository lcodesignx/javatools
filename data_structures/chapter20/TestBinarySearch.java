// program tests binary search on collections
import java.util.*;

public class TestBinarySearch {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a city: ");
	String str = input.next();
	String city = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
	
	ArrayList<String> col1 = new ArrayList<>();
	col1.add("London");
	col1.add("Paris");
	col1.add("Berlin");
	col1.add("Rome");

	// sort the list
	Collections.sort(col1);
	System.out.println(col1);

	// check if user's city is in the list
	if (col1.contains(city)) {
	    // check the position of london within the list
	    System.out.println(city + " is at position: " + Collections.binarySearch(col1, city));
	} else {
	    System.out.println(city + " is not in the city database");
	}

    }

} 
