//Reverse String & Check Palindrome String or not in Java
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		String s = new Scanner(System.in).nextLine();
        char [] x = s.toCharArray();
        for (int i = 0; i < x.length / 2; i++)
        {
            char temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
        String rev = new String(x);
        System.out.println(rev);
        if (s.toLowerCase().equals(rev.toLowerCase())) 
        {
            System.out.println("Palindrome String");
        }
        else System.out.println("Not Palindrome String");
	}
}