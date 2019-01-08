
import java.util.Scanner;
import java.util.LinkedList;

public class AddDataBase {

	// used for EditDataBase
	public LinkedList<LinkedList<String>> addSpecificData(String element_name, int index1, int index2,
			LinkedList<LinkedList<String>> list) {
		list.get(index1).add(index2, element_name);
		return list;
	}

	// used for adding names of fields (in line 0 of list)
	public LinkedList<LinkedList<String>> addFieldNames(LinkedList<LinkedList<String>> list, int numOfFields) {
		for (int i = 0; i < numOfFields; i++) {
			if (i == 0)
				System.out.printf("Give me a name for field %d-PRIMARY KEY OF DB: \n", i + 1);
			else
				System.out.printf("Give me a name for field %d: \n", i + 1);
			Scanner input = new Scanner(System.in);
			String name = input.next();
			list.get(i).add(name);

		}

		return list;
	}

	// used to add an entire line of data to the DataBase
	public LinkedList<LinkedList<String>> addData(LinkedList<LinkedList<String>> list, int numOfFields) {
		System.out.println("Adding data");
		System.out.println("�ype new data: ");
		Scanner input = new Scanner(System.in);
		String stop;
		stop = "yes";

		do {

			for (int i = 0; i < numOfFields; i++) {
				System.out.printf("Add one %s :  ", list.get(i).get(0));
				String element = input.next();
				list.get(i).add(element);

			}
			System.out.println("Do you want to stop adding data? Available options yes/no: ");

			stop = input.next();

			while (!stop.equals("yes") && !stop.equals("no")) {
				System.out.println("Wrong input. Give a yes/no!");
				stop = input.next();
			}

		} while (stop.equals("no"));

		return list;
	}
}
