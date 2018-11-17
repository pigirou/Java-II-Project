import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);
	public  void menu(String s) {
		int ch;
		System.out.println("Welcome");
		do {
			System.out.println("*Menu* \n 1)Add data \n 2)Remove data \n 3)View data \n 4)Data processing \n 5)Exit \n Please make a choice please:");
			ch = input.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Add data");
				System.out.println("Ôype new data: ");
				String nd= input.nextLine();
				/*kalw methodo add dinw orisma nd data*/
				break;

			case 2:
				System.out.println("Remove data");
				System.out.println("Which data is for remove?:");
				String rd= input.nextLine();
				/*kalw methodo remove dinw orisma rd data*/
				break;

			case 3:
				System.out.println("View data");
				System.out.println("Which element do you want to process?: ");
				String vd= input.nextLine();
				if (vd == "yes" ){
					/*deixnw ola ta data*/
				} else System.out.println("which data do you want to see?:");
				String vd2 = input.nextLine();
				/*kalw methodo view dinw orisma vd2 data */
				break;

			case 4:
				System.out.println("Data processing");
				System.out.println("Ôype data for processing: ");
				String pd= input.nextLine();
				/*kalw methodo epexergasias dinw orisma pd data*/
				break;

			case 5:
				System.out.println("Thanks a lot.Bye!");
				break;
			}

		} while(ch >= 1 && ch <5 );
	}
}

