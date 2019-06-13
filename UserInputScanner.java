
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.println("What is your first name? ");
		String fname = kin.nextLine();
		System.out.println("What is your last name? ");
		String lname = kin.nextLine();

		System.out.println("Hello " + name + ", it's nice to meet you!");
	
		System.out.println("what is your Street Address? ");
		String sname = kin.nextLine();
		System.out.println("What is your City? ");
		String cname = kin.nextLine();
		System.out.println("What is your State? ")
		String stname = kin.nextLine();
		System.out.println("What is your Zip? ")
		String zname = kin.nextLine();	
	}
}

