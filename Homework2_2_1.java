import java.util.Scanner;

class Homework2_2_1{
  public static void main(String args[])  { 
	
	Scanner stdIn = new Scanner (System.in);
	System.out.print("What's your name?\n");
	String s = stdIn.nextLine();
	System.out.print("birthday year(BC)?\n");
	int date = stdIn.nextInt();
	System.out.print("\nName: " + s);
	System.out.print("\nBirthDay(BC): " + (date-1911));
  }
}