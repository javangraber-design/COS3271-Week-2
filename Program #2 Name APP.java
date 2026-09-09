//Programmer: Javan Graber
//Date: 9/8/26

package javanproject;

import java.util.Scanner;
public class MyProject {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//Create the strings
		String firstName;
		String lastName;
		int age;
		double sleepHours;
		
		//Ask for user input
		System.out.print("Please enter your first name -->");
		firstName = userinput.nextLine();
		System.out.print("Please enter your last name -->");
		lastName = userinput.nextLine();
		System.out.print("Enter your age -->");
		age = userinput.nextInt();
		System.out.print("Enter your average hours of sleep -->");
		sleepHours = userinput.nextDouble();
		
		
		//Encourage the user
		System.out.println("\n");
		System.out.println("Here is the information you typed organized in a neat fashion: \n");
		System.out.print("\tFirst name: " + firstName + "\n");
		System.out.print("\tLast name: " + lastName + "\n");
		System.out.print("\tAge: " + age + "\n");
		System.out.format("\tAverage hours of sleep	: %.1f", + sleepHours);
		
	}

}
