import java.util.Scanner;

class linearSearch {

	public int num_Elements, search_Elements;
	public int array[];
	public boolean status = false;

	Scanner sc = new Scanner(System.in);

	public void implofSearch() {
		System.out.println("Enter the element you have to enter of array");
		num_Elements = sc.nextInt();

		System.out.println("Enter the elements now");
		insertValues();
		printValues();

		System.out.println("Enter the elements need to search");
		search_Elements = sc.nextInt();
		searchValues(search_Elements);

	}

	public void insertValues() {
		for (int i = 0; i < num_Elements; i++) {
			System.out.println("Enter the element at position " + i + ":");
			array[i] = sc.nextInt();
		}
	}

	public void printValues() {
		for (int i = 0; i < num_Elements; i++) {
			System.out.println("The value at position" + i + "is:" + array[i]);
		}
		System.out.println();
	}

public void searchValues(int value) {
	for (int i = 0 ; i<array.length; i++ ){
		if (array[i] == value) {
			System.out.println("Search Values" + search_Elements + "found at array index " + i);
			status = true;
		}
	}
	if (status == false ) {
		System.out.println("value not found");
	}
}
public static void main (String[]args) {
	linearSearch linearsearch =  new linearSearch();
	linearsearch.implofSearch();
}
}