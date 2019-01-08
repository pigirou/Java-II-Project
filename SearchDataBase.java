
import java.util.Scanner;
import java.util.LinkedList;

public class SearchDataBase {

	Scanner input = new Scanner(System.in);

	public int searchFieldName(LinkedList<LinkedList<String>> listOfLists, String fieldName) {

		int i = 0;
		int list_found = 0;
		int listIndex = -1;

		while (list_found == 0 && i < listOfLists.size()) {
			if (listOfLists.get(i).get(0).equals(fieldName)) {
				list_found = 1;
				listIndex = i;
			}
			i++;
		}
		// returns the index of the lists
		return listIndex;
	}

	// Finding elements in a specific field
	public int searchSpecificData(LinkedList<LinkedList<String>> listOfLists, int i) {
		int lineIndex = -1;
		if (i == -1) {
			System.out.println("Field does not exist");
		} else {
			int found = 0;
			int k = 0;
			int size = listOfLists.get(i).size();
			System.out.println("Which primary key's is the data you want to change? Option are:  ");

			for (int l = 1; l < listOfLists.get(0).size(); l++)
				System.out.printf("%s \n", listOfLists.get(0).get(l)); // gives primary key options to help the user
			System.out.println("Enter one of the choices above: \n");

			String element = input.next();
			while (k < size && found == 0) {
				if (listOfLists.get(0).get(k).equals(element)) {
					found = 1;
					lineIndex = k;
				}
				k++;
			}

			if (found == 0) {
				System.out.printf("List doesn't contain the %s  %s \n", listOfLists.get(0).get(0), element);
			}
		}

		return lineIndex;
	}

	public int searchForPrimaryKey(LinkedList<LinkedList<String>> listOfLists, String pk) {
		int lineIndex = -1;
		int found = 0;
		int k = 0;
		int size = listOfLists.get(0).size();

		while (k < size && found == 0) {
			if (listOfLists.get(0).get(k).equals(pk)) {
				found = 1;
				lineIndex = k;
			}
			k++;
		}

		if (found == 0) {
			System.out.printf("List doesn't contain the %s  %s \n", listOfLists.get(0).get(0), pk);
		}

		return lineIndex;
	}

}
