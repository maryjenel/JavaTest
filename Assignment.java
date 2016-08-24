import java.util.Scanner;

public class Assignment {


	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String[] myStringArray = {"Jenel","Mary","Bridget"};
	for (int i = 0; i < myStringArray.length; i++ ) {
		if (myStringArray[i].equals("Jenel")){
			System.out.print("There's a Jenel! in the array");
		}
	}
}
}
