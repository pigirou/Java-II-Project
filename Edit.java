package Javatoi;
import java.util.*;
import java.util.LinkedList;

public class Edit {

	Scanner input= new Scanner(System.in);

	AddDataBase addfield = new AddDataBase();
	RemoveDataBase removefield = new RemoveDataBase();
	SearchDataBase searchfield = new SearchDataBase();


	public void editField(LinkedList<LinkedList<String>> listOfLists) {

		System.out.println("Edit specific data");

		//user chooses the specific data
		int listIndex = searchfield.searchFieldName(listOfLists);
		int lineIndex = searchfield.searchSpecificData(listOfLists, listIndex);
		//an listIndex == -1 den exei brei primary key
		//an lineIndex == -1 tote eite den exei brei primary key eite den exei brei element

		if (lineIndex != -1) {

			//specific data is removed
			removefield.removeSpecificData(listIndex, lineIndex, listOfLists);

			//specific data is added
			System.out.println("Enter the name of the new element");
			String element_name = input.next();
			addfield.addSpecificData(element_name, listIndex, lineIndex, listOfLists);
		} else {
			System.out.println("Cannot find data");
		}
	}
}
