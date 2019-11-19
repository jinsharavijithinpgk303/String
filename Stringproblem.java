package string;
import java.util.Scanner;
public class Stringproblem {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int i;
     System.out.println("Enter the String:");
     String a = s.nextLine();
     String[] words = a.split(" ");
     for(i=0;i<words.length;i++)
     {
    	 if(i%2!=0)
    	 {
    		 int l = words[i].length();
    		 for(int j=l-1;j>=0;j--)
    		 {
    			 System.out.print(words[i].charAt(j));
    			 
    		 }
    		 System.out.print(" ");
    	 }
    	 else
    	 {
    		 System.out.print(words[i]+" ");
    	 }
    	 }
	}
}