//Check Dracula/Vampaier or not 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int cnt,n=new Scanner(System.in).nextInt();
		/*
		Logic for Dracula/Vampire Number
		1) Even no. of digit
        2) Do pairing (i.e half i.e. n/2)
        3) Only one part end with 0
        4) Exactly same digit used without repeat (digit arrangement doesn't matter)
		*/
		//Logic for Even No. of digit
		cnt=0;
		while(n>0)
		{
		    int r=n%10;
		    n=n/10;
		    cnt++;
		}
		if(cnt%2==0)
		{
		    System.out.println(cnt);
		    //till not complete
		}
		else System.out.println("Please input Even Digit Number");
	}
}
