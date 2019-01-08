
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDataBase {

	// used for EditDataBase2k
	public LinkedList<LinkedList<String>> removeSpecificData(int index1, int index2,
			LinkedList<LinkedList<String>> listOfLists) {
		listOfLists.get(index1).remove(index2);
		return listOfLists;
	}

	public LinkedList<LinkedList<String>> removeData(LinkedList<LinkedList<String>> list, int numOfFields) {
		System.out.println("Removing data");
		Scanner input = new Scanner(System.in);
		String pk;

		String stop = "yes";
		int counter = 0;

		do {
			counter++;
			System.out.printf("Which primary key's data do you want to remove? ", list.get(0).get(0));
			System.out.println("Options are: ");
			for (int i = 1; i < list.get(0).size(); i++) {
				System.out.printf("%s \n", list.get(0).get(i));
			}
			System.out.println("Now enter your choice: ");
			try {
				pk = input.next();
				int fieldLine;
				fieldLine = list.get(0).indexOf(pk);
				for (int f = 0; f < numOfFields; f++)
					list.get(f).remove(fieldLine);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("IndexOutOfBoundsException");
			}

			System.out.println("Do you want to stop removing data? Available options yes/no: ");
			stop = input.next();
			while (!stop.equals("yes") && !stop.equals("no")) {
				System.out.println("Wrong input. Give a yes/no!");
				stop = input.next();
			}

		} while (stop.equals("no"));

		return list;
	}
}
