//Concatenate String by append method in Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String s1=new Scanner(System.in).nextLine();
	    String s2=new Scanner(System.in).nextLine();
		StringBuffer s=new StringBuffer(s1 );
		s.append( s2);
		System.out.println(s);
	}
}
