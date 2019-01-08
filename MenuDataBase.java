
import java.util.Scanner;
import java.util.LinkedList;

public class MenuDataBase {

	public void menu(LinkedList<LinkedList<String>> list, int numOfFields) {

		Scanner input = new Scanner(System.in);
		int ch = 0;

		AddDataBase add = new AddDataBase();
		RemoveDataBase remove = new RemoveDataBase();
		Edit edit = new Edit();
		ViewDataBase view = new ViewDataBase();

		do {
			System.out.println(
					" \n *Menu* \n 1)Add data \n 2)Remove data \n 3)View data \n 4)Data processing \n 5)Exit \n Make a choice please:");

			ch = input.nextInt();
			while (ch < 1 || ch > 5) {
				System.out.println("There's no such choice. Please try again.");
				ch = input.nextInt();
			}

			switch (ch) {
			case 1:
				add.addData(list, numOfFields);
				break;

			case 2:
				remove.removeData(list, numOfFields);
				break;

			case 3:

				view.printMenu(list);

				break;

			case 4:
				edit.editField(list);
				break;

			case 5:
				System.out.println("Thanks a lot.Bye!");
				break;

			}
		} while (ch >= 1 && ch < 5);
	}
}
