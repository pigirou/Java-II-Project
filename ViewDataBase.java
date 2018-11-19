import java.util.*;
public class ViewDataBase extends TestListOfLists3 {
	Scanner input=new Scanner(System.in);
	public void printMenu() {
	System.out.printf("Press 1) If you want to print the whole DataBase, \n"
			+ "2) If you want to print the characteristics of a specific primary key and  \n"
			+ "3) If you want to print a specific element of the DataBase\n");
	}
	int choice=input.nextInt();
	
	public void viewAllData(LinkedList listOfLists) {
		System.out.println(listOfLists);
	}
	
	public void viewDataLine(LinkedList<LinkedList<String>> listOfLists ) {
		String b="";
		System.out.print("Who's Data do you want to view?");
		String index=input.next();
			//int y=searchSpecificData(listOfLists,index); searchSpecificData notready index-->Epilogh Xrhsth
			for(int i=0;i<=listOfLists.size();i++) {
				b=listOfLists.get(y).get(i);
				System.out.printf(b);
			}
	}
	
	public void viewSpecificData (LinkedList<LinkedList<String>> listOfLists,String index) {
		String datachoice;
		String personchoice;
		System.out.print("What type of Data do you want to see?\n");
		datachoice=input.next();
		//int a=searchSpecificData(listOfLists,...)
		System.out.print("Who's Data?");
		personchoice=input.next();
		//searchFields(listOfLists,...)
		
	}
	
	/*public int searchSpecificData(LinkedList<LinkedList<String>> listOfLists,String index) {
	int y; //to index einai h epilogh tou xrhsth
	for ( y=0;y<=listOfLists.size();y++)
		if (listOfLists.get(y).get(0).equals(index))
		{				
			break;			
		} else {
			return 0;
		}
		return y; 
	}
*/
}