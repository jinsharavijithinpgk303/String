package string;

public class String_newString {

	public static void main(String[] args) {
    StringBuffer a = new StringBuffer("Hello");
    StringBuffer b = new StringBuffer("Hello world");
    StringBuffer c = new StringBuffer("Hello world");
    StringBuffer d = new StringBuffer("Hello world");


    a.append("world");
    b.delete(0, 2);
    c.replace(5,8 ,"flower");
    d.deleteCharAt(3);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);



    
	}

}
