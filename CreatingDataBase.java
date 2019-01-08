
import java.util.LinkedList;
import java.util.Scanner;

public class CreatingDataBase {
	public LinkedList<LinkedList<String>> create(LinkedList<LinkedList<String>> listOfLists) {
		System.out.println("How many fields do you want to add to your DataBase?");
		Scanner input = new Scanner(System.in);
		int fields = input.nextInt();

		for (int y = 0; y < fields; y++) {
			LinkedList<String> singleList = new LinkedList<String>();
			listOfLists.add(singleList);
		}

		// giving names to fields
		AddDataBase addBase = new AddDataBase();
		addBase.addFieldNames(listOfLists, fields);

		// adding initial data
		addBase.addData(listOfLists, fields);

		// calling the menu
		MenuDataBase menu1 = new MenuDataBase();
		menu1.menu(listOfLists, fields);

		return listOfLists;
	}
}
