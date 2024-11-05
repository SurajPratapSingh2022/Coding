////Check Palindrome String or not
import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    String rev = "", str=new Scanner(System.in).nextLine();
    for (int i = (str.length() - 1); i >=0; --i) {
      rev = rev + str.charAt(i);
    }
    if (str.toLowerCase().equals(rev.toLowerCase())) 
    {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}