package Javatoi;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDataBase {

	// used for processing- removes an element in order to add a new one
	public LinkedList<LinkedList<String>> removeSpecificData(int index1, int index2,
			LinkedList<LinkedList<String>> listOfLists) {
		listOfLists.get(index1).remove(index2);
		return listOfLists;
	}

	public LinkedList<LinkedList<String>> removeData(LinkedList<LinkedList<String>> list, int numOfFields) {
		System.out.println("Removing data");
		Scanner input = new Scanner(System.in);
		String field0;

		String stop = "yes";
		int counter = 0;

		do {
			counter++;
			System.out.println("Whose data do you want to remove? ");
			field0=input.next();
			
			
			//fieldLine= the line of the person I want to remove from the DataBase
			int fieldLine = list.get(0).indexOf(field0);
		
			
			for(int i=0; i<numOfFields; i++) 
				list.get(i).remove(fieldLine);
			
			
			System.out.println("Do you want to stop removing data? Available options yes/no: ");
			stop = input.next();

		} while (stop.equals("no"));

		return list;
	}
}
