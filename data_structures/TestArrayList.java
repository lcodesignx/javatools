// Program demonstrates the use of the ArrayList Class
import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

	// Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();
	
	// add some cities to the list
	cityList.add("Lodon");
	cityList.add("Seoul");
	cityList.add("Tokyo");
	cityList.add("Berlin");
	cityList.add("Paris");
	cityList.add("Rome");

	// display list size
  	System.out.println("List size? " + cityList.size());

	// Check if the list is empty
	System.out.println("Is the list empty? " + cityList.isEmpty());

	// Check if Paris is in the city list
	System.out.println("Is Paris in the list? " + cityList.contains("Paris"));

	// Insert a new city at index 2
	cityList.add(2, "New York");

	// Display the contents of the list
	System.out.println(cityList.toString());

	// display list again using a loop
	for (String element: cityList)
	    System.out.println(element);
    }

}
