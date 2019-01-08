import java.util.*;
import java.util.LinkedList;

public class TestListOfLists3 {
	
	public static void main(String[] args) {
	    System.out.println("Give me number of fields: ");
		Scanner input= new Scanner(System.in);
		int i= input.nextInt();

		LinkedList<LinkedList<String>> listOfLists = new LinkedList<LinkedList<String>>();
		for(int y=0; y<i; y++) {
		 LinkedList<String> singleList= new LinkedList<String>();
		 listOfLists.add(singleList);

		}

	//estw methodos pou orizei onomata pediwn
	for(int y=0; y<i; y++) {
		System.out.printf("Give me a name for the %d field: \n", y+1);
		String s= input.next();
		listOfLists.get(y).add(s);
		
		
	}
		
		
	String stop="yes";
	int counter=0;
	  do{
		counter++;  

	for(int y=0; y<i; y++) {
		System.out.printf("Add %s %d:  ",listOfLists.get(y).get(0),counter);
		String s= input.next();
		listOfLists.get(y).add(s);

		}
		System.out.println("Do you want to stop? Available options yes/no: ");
		stop= input.next();

	} while(stop.equals("no"));

		System.out.println(listOfLists);





			}
}