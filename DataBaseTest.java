package Javatoi;

import java.util.LinkedList;
import java.util.Scanner;

public class DataBaseTest {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		System.out.println("How many fields do you want to add to your DataBase?");
		Scanner input = new Scanner(System.in);
		int fields = input.nextInt();

		// making a list of lists as our DataBase
		LinkedList<LinkedList<String>> listOfLists = new LinkedList<LinkedList<String>>();
		for (int y = 0; y < fields; y++) {
			LinkedList<String> singleList = new LinkedList<String>();
			listOfLists.add(singleList);
		}

		// giving names to fields
		AddDataBase addBase = new AddDataBase();
		addBase.addFieldNames(listOfLists, fields);

		// adding initial data
		addBase.addData(listOfLists, fields);
		System.out.println(listOfLists);

		// calling the menu
		MenuDataBase menu1 = new MenuDataBase();
		menu1.menu(listOfLists, fields);

	}

}
