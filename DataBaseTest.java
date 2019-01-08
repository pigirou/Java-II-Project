
import java.util.LinkedList;
import java.util.Scanner;

public class DataBaseTest {

	public static void main(String[] args) {
		System.out.println("Welcome!");

		// making a list of lists as our DataBase
		LinkedList<LinkedList<String>> listOfLists1 = new LinkedList<LinkedList<String>>();
		Scanner input = new Scanner(System.in);
		MenuDataBase mn = new MenuDataBase();

		CreatingDataBase creation = new CreatingDataBase();
		creation.create(listOfLists1);

		System.out.println("Do you want to make a second entity to your DataBase? (yes/no)");
		String choice;

		choice = input.next();
		while (!choice.equals("yes") && !choice.equals("no")) {
			System.out.println("Wrong input. Give a yes/no!");
			choice = input.next();
		}

		if (choice.equals("yes")) {
			LinkedList<LinkedList<String>> listOfLists2 = new LinkedList<LinkedList<String>>();
			creation.create(listOfLists2);

			do {
				System.out.println("Do you want to edit one of the DataBases again?");
				choice = input.next();
				while (!choice.equals("yes") && !choice.equals("no")) {
					System.out.println("Wrong input. Give a yes/no!");
					choice = input.next();
				}
				if (choice.equals("yes")) {
					System.out.println("Choose a DataBase. Choices are 1 and 2");
					int ch;
					ch = input.nextInt();
					while (ch != 1 && ch != 2) {
						System.out.println("Wrong choice. Please try again.");
						ch = input.nextInt();
					}
					if (ch == 1)
						mn.menu(listOfLists1, listOfLists1.size());
					else
						mn.menu(listOfLists2, listOfLists2.size());

				}
			} while (choice.equals("yes"));

		} else {
			System.out.println("All done. Bye!");
		}

	}
}