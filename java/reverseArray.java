//Reverse a String in Java
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		//String str= "Geeks", rev="";
		String rev="", str=new Scanner(System.in).nextLine();
		char ch;
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		rev= ch+rev; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ rev);
	}
}
