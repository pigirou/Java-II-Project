

import java.util.*;
import java.util.LinkedList;

public class Edit {

	Scanner input = new Scanner(System.in);

	AddDataBase addfield = new AddDataBase();
	RemoveDataBase removefield = new RemoveDataBase();
	SearchDataBase searchfield = new SearchDataBase();

	public void editField(LinkedList<LinkedList<String>> listOfLists) {

		System.out.println("Edit specific data");

		// user chooses the specific data

		System.out.println("In which field is the element you want to change? Options are: ");
		for (int field = 0; field < listOfLists.size(); field++) {
			System.out.printf("%s \n", listOfLists.get(field).get(0));
		}

		System.out.println("Enter one of the choices above: ");
		String fieldName = input.next();
		int listIndex = searchfield.searchFieldName(listOfLists, fieldName);


		int lineIndex = searchfield.searchSpecificData(listOfLists, listIndex);
		// if listIndex == -1 primary key is not found
		// if lineIndex == -1 primary key or element is not found

		if (lineIndex != -1) {

			// specific data is removed
			removefield.removeSpecificData(listIndex, lineIndex, listOfLists);

			// specific data is added
			System.out.println("Enter the new element: ");

			String element_name = input.next();
			addfield.addSpecificData(element_name, listIndex, lineIndex, listOfLists);
		} else {
			System.out.println("Cannot find data");
		}
	}
}
