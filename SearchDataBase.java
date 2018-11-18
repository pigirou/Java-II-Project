import java.util.*;
import java.util.LinkedList;
public class SearchDataBase {

	public void searchFieldName(LinkedList<LinkedList<String>> listOfLists) {

		// Finding elements in the linked list
		System.out.println("Enter the element you would like to search");
		String element= input.next();
		int found = 0;

		for(int y=0; y < listOfLists.size(); y++) {
				boolean status = listOfLists.get(y).contains(element);
				if(status) {
					System.out.printf("Database contains the element : %s", element);

					//returns the primary key of the list that the item has been found
					System.out.println("");
					System.out.print("The primary key of the list that the item has been found is : ");
					System.out.println(listOfLists.get(y).get(0));

					found = 1;
				}
		}

		if (found == 0) {
			System.out.printf("Database doesn't contain the element : %s", element);
		}



	}
}
