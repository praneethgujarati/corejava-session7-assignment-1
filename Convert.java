/* Assignment 7.1: Program to convert an int variable to String using an inbuilt function of String class.
   Display the int converted to String
*/

import java.util.Scanner;	// Scanner java utility
class Convert {
	public static void main(String[] args){
		try{
			System.out.print("Enter the numeric number: ");
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			System.out.println("Output without inbuilt String function:\t" + (i + i));
			System.out.println("Output using inbuilt String function:\t" + (i + String.valueOf(i))); // Using valueOf method in String class to convert integer to String.
		} catch (Exception e){System.out.println("Invalid Inputs!");}
	}
}