//Programmer: Javan Graber
//Date: 9/9/26

package javanproject;
import java.util.Scanner;
import java.util.Random;

public class MyProject {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		//Generate a random integer between 0 and 255
		Random r = new Random();
		int randomInteger = r.nextInt(256);
		
		//Create variables
		String binary;
		String hexa;
		
		//Print the number and its conversions
		System.out.println("Random Number: "+ randomInteger);
		
		binary = Integer.toBinaryString(randomInteger);
		System.out.println("Random Number in Binary: " + binary);
		
		hexa = Integer.toHexString(randomInteger);
		System.out.println("Random Number in Hexadecimal: " + hexa);
		
		System.out.println("Random Number in ASCII: " + (char)(randomInteger));
	}

}
