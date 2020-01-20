// program sorts a list and also reverses the order of the list
import java.util.*;

public class TestSorting {

    public static void main(String[] args) {

	List<String> list = Arrays.asList("red", "green", "blue");
	Collections.sort(list);
	System.out.println(list);

	// reverse order
	Collections.sort(list, Collections.reverseOrder());
	System.out.println(list);
    }

}
