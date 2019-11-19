package string;
import java.util.Scanner;
public class Stringflames {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter name1:");
   StringBuffer name1 = new StringBuffer(s.next());
   System.out.println("Enter name2:");
   StringBuffer name2 = new StringBuffer(s.next());
    int i,j;
    for(i=0;i<name1.length();i++)
    {
    	char  a= name1.charAt(i);
    for(j=0;j<name2.length();j++)
    {
    	char b = name2.charAt(i);
       if(a==b)
       {
    	   name1.replace(i, i+1,"0");
    	   name2.replace(j,j+1,"0");
    	 
    	   
       }
   
	   
   
    
	}

    }
	}
}
	
