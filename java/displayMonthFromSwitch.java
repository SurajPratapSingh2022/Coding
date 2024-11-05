//write a prg to display the name of month after number in the form of word from the keyboard
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        String m=new Scanner(System.in).nextLine();
        switch(m)
        {
         case "one":System.out.println("Jan");break;
         case "two":System.out.println("feb");break;
         case "three":System.out.println("mar");break;
         case "four":System.out.println("apr");break;
         case "five":System.out.println("may");break;
         case "six": System.out.println("june");break;
         case "seven":System.out.println("july");break;
         case "eight":System.out.println("august");break;
         case "nine":System.out.println("september");break;
         case "ten":System.out.println("october");break;
         case "eleven":System.out.println("november");break;
         case "twelve":System.out.println("december");break;
         default:System.out.println("invalid number");
        }
    }
}