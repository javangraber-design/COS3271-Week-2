//Programmer: Javan Graber
//Date: 9/8/26

package javanproject;

import java.util.Scanner;
public class MyProject {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//Create the strings
		String firstName;
		String middleName;
		String lastName;
		//Ask for user input
		System.out.print("Please enter your first name -->");
		firstName = userinput.nextLine();
		System.out.print("Please enter your middle name -->");
		middleName = userinput.nextLine();
		System.out.print("Please enter your last name -->");
		lastName = userinput.nextLine();
		//Create some Unicode characters
		char amazedFace = '\u00D6';
		char crossSymbol = '\u01c2';
		//Encourage the user
		System.out.println("\n");
		System.out.println("\tRemember, " + firstName + " " + middleName + " " + lastName + ",\n");
		System.out.println("\tJesus is with you every step of the way (no matter how difficult) through His death on the cross. " + crossSymbol);
		System.out.format("%80s", "Isn't it amazing how He always watches over us? " + amazedFace);
		
	}

}
