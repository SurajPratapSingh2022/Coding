//Plus Shape- Pattern Printing in Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //For accurate mid point always required a odd number
		System.out.print("Enter odd number: ");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Our pattern is ---- ");
		for(int i=1; i<=n; i++)
		{
		    if(i==((n/2)+1))  
		    {  
              for(int j=1;j<=n;j++)  
               {  
                  System.out.print("+");  
               }  
            }  
            else  
                {  
                  for(int j=1;j<=n/2;j++)  
                    {  
                       System.out.print(" ");  
                    }  
                System.out.print("+");  
                }  
		    System.out.print("\n");
		}
	}
}