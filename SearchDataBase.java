import java.util.*;
import java.util.LinkedList;
public class SearchDataBase {

	Scanner input = new Scanner(System.in);

	//searchFields den trexei swsta den briskei to primary key bgazei exception!!!!!!
	//find a field by entering primary key
	public int searchFieldName(LinkedList<LinkedList<String>> listOfLists) {

		System.out.println("Enter primary key to access field");
		String pk= input.next();
		int i = 0;
		int list_found = 0;
		int listIndex = -1;

		do{
			if(listOfLists.get(i).get(0).equals(pk)) {
				list_found = 1;
				listIndex = i;
			}
			i++;
		}while(list_found == 0 || i < listOfLists.size());
		//returns the index of the list
		return listIndex;
	}




	// Finding elements in a specific field
	public int searchSpecificData(LinkedList<LinkedList<String>> listOfLists) {
		int i = searchFieldName(listOfLists);
		int lineIndex = -1;
		if (i == -1) {
			System.out.println("Primary key does not exist");
		} else {
			int found = 0;
			int k = 0;
			int size = listOfLists.get(i).size();
			System.out.println("Enter the element you would like to search");
			String element= input.next();
			do{
				if (listOfLists.get(i).get(k).equals(element)) {
					System.out.printf("List contains the element : %s", element);
					found = 1;
					lineIndex = k;
				}
				k++;
			}while(found == 0 || k >= size);


			//bgazei exception!!!!!!
			//den trexei swsta otan l >= listOfLists.size() bgazei exception kai den doulevi pote h katw if!!!!!

			if (found == 0) {
				System.out.printf("List doesn't contain the element : %s", element);
			}
		}
		//epistrefei -1 eite otan den exei brei primary key eite otan den exei brei element
		return lineIndex;
	}
}
