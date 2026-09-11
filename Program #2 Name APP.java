//Programmer: Javan Graber
//Date: 9/11/26

package javanproject;

import java.util.Scanner;
public class MyProject {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//Create the variables
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
		
		
		//Print the info
		System.out.println("\n");
		System.out.format("%65s", "Here is the information you typed organized in a neat fashion:");
		System.out.println("\n");
		System.out.println("\tFirst name: " + firstName + "\n");
		System.out.println("\tLast name: " + lastName + "\n");
		System.out.println("\tAge: " + age + "\n");
		System.out.format("\tAverage hours of sleep: %.1f", + sleepHours);
		System.out.println("\n");
		
	}

}
