package Javatoi;

import java.util.LinkedList;
import java.util.Scanner;

public class DataBaseTest {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		TestGraphics2 t=new TestGraphics2();
		t.frame();
		
		// making a list of lists as our DataBase
		LinkedList<LinkedList<String>> listOfLists1 = new LinkedList<LinkedList<String>>();
		Scanner input = new Scanner(System.in);

		CreatingDataBase creation = new CreatingDataBase();
		creation.create(listOfLists1);
		

		System.out.println("Do you want to make a second entity to your DataBase? (yes/no)");
		String choice = input.next();

		if (choice.equals("yes")) {
			LinkedList<LinkedList<String>> listOfLists2 = new LinkedList<LinkedList<String>>();
			creation.create(listOfLists2);

		} else {
			System.out.println("All done. Bye!");
		}
		

	}

}
