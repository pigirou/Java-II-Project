
import java.util.Scanner;
import java.util.LinkedList;

public class ViewDataBase {
	Scanner input = new Scanner(System.in);
	SearchDataBase search = new SearchDataBase();

	public void printMenu(LinkedList<LinkedList<String>> listOfLists) {
		System.out.printf("Press 1) If you want to print the whole DataBase, \n"
				+ "2) If you want to print the characteristics of a specific primary key and  \n"
				+ "3) If you want to print a specific element of the DataBase\n Enter your choice: \n");

		int choice = input.nextInt();
		while (choice < 1 || choice > 3) {
			System.out.println("There's no such choice. Please try again.");
			choice = input.nextInt();
		}
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
			try {
				String primary_key = input.next();
				int indexOfPK = search.searchForPrimaryKey(listOfLists, primary_key);
				viewDataLine(listOfLists, indexOfPK);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundsException");
			}
			break;
		case 3:
			viewSpecificData(listOfLists);
			break;
		default:
			System.out.println("You made a wrong choice");

		}
	}

	public void viewAllData(LinkedList<LinkedList<String>> listOfLists) {

		for (int l = 0; l < listOfLists.get(0).size(); l++) {
			System.out.printf("%s ", l + 1);
			viewDataLine(listOfLists, l);
			System.out.println();
		}

	}

	public void viewDataLine(LinkedList<LinkedList<String>> listOfLists, int line) {

		for (int field = 0; field < listOfLists.size(); field++) {

			System.out.printf("%15s ", listOfLists.get(field).get(line));

		}
	}

	public void viewSpecificData(LinkedList<LinkedList<String>> listOfLists) {
		String fieldChoice;
		String pkChoice;
		System.out.print("In which field is the element you want to view? Options are: \n");
		for (int f = 0; f < listOfLists.size(); f++)
			// prints fields, gives options to the user
			System.out.printf("%s \n", listOfLists.get(f).get(0));

		System.out.println("Enter one of the choices above: \n");

		fieldChoice = input.next();
		int indexOfField = search.searchFieldName(listOfLists, fieldChoice);
		if (indexOfField != -1) {
			System.out.print("Give me the primary key that the element describes. Options are: \n");

			for (int l = 1; l < listOfLists.get(0).size(); l++)
				// gives primary key options to help the user
				System.out.printf("%s \n", listOfLists.get(0).get(l));
			System.out.println("Enter one of the choices above: \n");

			try {
				pkChoice = input.next();

				int pkIndex = listOfLists.get(0).indexOf(pkChoice);

				System.out.println(listOfLists.get(indexOfField).get(pkIndex));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundsException");
			}
		} else
			System.out.println("Index not in the list");
	}
}