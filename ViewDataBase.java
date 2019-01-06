package Javatoi;

import java.util.*;

public class ViewDataBase {
	Scanner input = new Scanner(System.in);
	SearchDataBase search = new SearchDataBase();

	public void printMenu(LinkedList<LinkedList<String>> listOfLists) {
		System.out.printf("Press 1) If you want to print the whole DataBase, \n"
				+ "2) If you want to print the characteristics of a specific primary key and  \n"
				+ "3) If you want to print a specific element of the DataBase\n Enter your choice: \n");
		int choice = input.nextInt();
		Choices(choice, listOfLists);
	}

	public void Choices(int choice, LinkedList<LinkedList<String>> listOfLists) {
		switch (choice) {
		case 1:
			viewAllData(listOfLists);
			break;
		case 2:
			System.out.println("Which primary key's data do you want to see? Options are: ");
			for (int i = 1; i < listOfLists.get(0).size(); i++) {
				System.out.printf("%s \n", listOfLists.get(0).get(i));
			}
			System.out.println("Enter one of the choices above: ");

			String primary_key = input.next();
			int indexOfPK = search.searchForPrimaryKey(listOfLists, primary_key); // searching for the primary key in
																					// the
																					// first column
			viewDataLine(listOfLists, indexOfPK);
			break;
		case 3:
			viewSpecificData(listOfLists);
			break;
		default:
			System.out.println("You made a wrong choice");

		}
	}

	public void viewAllData(LinkedList<LinkedList<String>> listOfLists) {

		for (int l = 0; l < listOfLists.get(0).size(); l++) { // the size of each line
			System.out.printf("%s ", l + 1); // prints line number to be more practical for the database
			viewDataLine(listOfLists, l);
			System.out.println();
		}

	}

	public void viewDataLine(LinkedList<LinkedList<String>> listOfLists, int line) {

		for (int f = 0; f < listOfLists.size(); f++) { // < not <=
			// f=field for each field

			System.out.printf("%15s ", listOfLists.get(f).get(line));

		}
	}

	public void viewSpecificData(LinkedList<LinkedList<String>> listOfLists) {
		String fieldChoice;
		String pkChoice;
		System.out.print("In which field is the element you want to view? Options are: \n");
		for (int f = 0; f < listOfLists.size(); f++)
			System.out.printf("%s \n", listOfLists.get(f).get(0)); // prints fields, gives options to the user

		System.out.println("Enter one of the choices above: \n");
		fieldChoice = input.next();
		int indexOfField = search.searchFieldName(listOfLists, fieldChoice);
		System.out.print("Give me the primary key that the element describes. Options are: \n");

		for (int l = 1; l < listOfLists.get(0).size(); l++)
			System.out.printf("%s \n", listOfLists.get(0).get(l)); // gives primary key options to help the user
		System.out.println("Enter one of the choices above: \n");

		pkChoice = input.next();

		int pkIndex = listOfLists.get(0).indexOf(pkChoice);

		System.out.println(listOfLists.get(indexOfField).get(pkIndex));
	}

}