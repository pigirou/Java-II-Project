package Javatoi;

import java.util.Scanner;
import java.util.LinkedList;

public class AddDataBase {
	private int counter=0;
	
	//used for processing- adds a new element where the previous one has been removed
	public LinkedList<LinkedList<String>> addSpecificData(String element_name, int index1, int index2,
			LinkedList<LinkedList<String>> list) {
		list.get(index1).add(index2,element_name);
		return list;
	}

	//used for adding names to the list's fields (line 0)
	public LinkedList<LinkedList<String>> addFieldNames(LinkedList<LinkedList<String>> list, int numOfFields) {
		for (int i = 0; i < numOfFields; i++) {
			System.out.printf("Give me a name for the %d field: \n", i + 1);
			Scanner input = new Scanner(System.in);
			String s = input.next();
			list.get(i).add(s);

		}

		return list;
	}
	
	//used to add an entire line of data to the DataBase
	public LinkedList<LinkedList<String>> addData(LinkedList<LinkedList<String>> list, int numOfFields) {
		System.out.println("Adding data");
		System.out.println("Ôype new data: ");
		Scanner input = new Scanner(System.in);
		String stop = "yes";

		do {
			counter++;

			for (int i = 0; i < numOfFields; i++) {
				System.out.printf("Add %s %d:  ", list.get(i).get(0), counter);
				String s = input.next();
				list.get(i).add(s);

			}
			System.out.println("Do you want to stop adding data? Available options yes/no: ");
			stop = input.next();

		} while (stop.equals("no"));

		return list;
	}
}
