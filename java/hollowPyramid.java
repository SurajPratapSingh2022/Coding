// Hollow Pyramid Shape- Pattern Printing in Java
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //For accurate mid point always required a odd number
		System.out.print("Enter row: ");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Our pattern is ---- ");
		int m=n;
		for(int i=1;i<=n;i++)  
           {  
              for(int k=1;k<m-1;k++)  
                 {  
                   System.out.print(" ");  
                 }  
              for(int j=1;j<=2*i-1;j++)  
                {  
                  if(j==1 || j==2*i-1 || i==n)  
                  System.out.print("*");  
                  else  
                  System.out.print(" ");  
                }  
               m--;  
              System.out.print("\n");  
            }             
	}
}