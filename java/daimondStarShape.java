//Daimond Star Shape- Pattern Printing in Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //For accurate mid point always required a odd number
		System.out.print("Enter row: ");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Our pattern is ---- ");
		int spaces=n-1;  
        int stars=1;  
        for(int i=1;i<=n;i++)  
         {  
            for(int k=1;k<=spaces;k++)  
              {  
                   System.out.print(" ");  
              }  
            for(int j=1;j<=stars;j++)  
              {  
                   System.out.print("*");           
              }  
            if(spaces>i)  
              {  
                spaces=spaces-1;  
                stars=stars+2;  
              }  
            if(spaces<i)  
               {  
                 spaces=spaces+1;  
                 stars=stars-2;  
               }  
            System.out.print("\n");  
         }  
    }
}