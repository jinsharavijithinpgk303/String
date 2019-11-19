package string;
import java.util.Scanner;
public class Employee_details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer a = new StringBuffer();
		System.out.println("Enter the name:");
		a.append("\nNAME:" +sc.nextLine());
		System.out.println("Enter the ID number:");
		a.append("\nID:" +sc.nextLine());
		System.out.println("Enter the Address:");
		a.append("\nADDRESS:" +sc.nextLine());
		System.out.println("Enter the Age:");
		a.append("\nAGE:" +sc.nextLine());
		System.out.println("Enter the Salary:");
		a.append("\nSALARY:" +sc.nextLine());
        System.out.println(a);
		
    
	}

}
