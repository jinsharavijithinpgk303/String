package string;
import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter string1:");
    String a = s.nextLine();
    int length = a.length();// find the length of string
    System.out.println("Enter string2:");
    String b = s.nextLine();
    System.out.println("length:"+length);
    char character = a.charAt(3);//character
    System.out.println("character: "+character);
    String substring  = a.substring(2,4);//substring
    System.out.println("substring:"+substring);
    boolean Startwith = a.startsWith("the");
    System.out.println("Stratwith:"+Startwith);
    int indexof = a.indexOf("is");
    System.out.println("indexof:"+indexof);
    String concat = a.concat(b);
    System.out.println("concat:"+ concat);
    String word[] = a.split(" ");
    for(int i=0;i<word.length;i++)
    {
    	System.out.println(word[i]);
    }
    boolean equal = a.contentEquals(b);
    System.out.println("equals:"+equal);
    String replace = a.replace("t","T");
    System.out.println("Replace:"+replace);
    		
    }
    
	}


