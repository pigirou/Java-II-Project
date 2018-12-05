
import java.util.Scanner;
import java.util.LinkedList;

public class MenuDataBase {

	public void menu(LinkedList<LinkedList<String>> list, int numOfFields) {
		Scanner input = new Scanner(System.in);
		int ch = 0;
		// creating objects for classes AddDataBase etc.
		AddDataBase add = new AddDataBase(0);
		RemoveDataBase remove = new RemoveDataBase();
		EditDataBase edit = new EditDataBase();
		ViewDataBase view = new ViewDataBase();

		do {
			System.out.println(
					"*Menu* \n 1)Add data \n 2)Remove data \n 3)View data \n 4)Data processing \n 5)Exit \n Make a choice please:");
			ch = input.nextInt();

			switch (ch) {
			case 1:
				add.addData(list, numOfFields);
				break;

			case 2:
				remove.removeData(list, numOfFields);
				break;

			case 3:
				int choice = view.printMenu();
				switch (choice) {
				case 1:
					view.viewAllData(list);
					break;
				case 2:
					// view.viewDataLine(list);
					break;
				case 3:
					view.viewSpecificData(list);
				}
				break;

			case 4:
				edit.editElement(list);
				break;

			case 5:
				System.out.println("Thanks a lot.Bye!");
				break;
			}

		} while (ch >= 1 && ch < 5);
	}
}
