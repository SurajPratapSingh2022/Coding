//in array, find bigger & smaller no. from 5 user inputing no. in Java
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     //int arr[] = new int[]{12, 34, 19, 8, 10}; //intialization
     int arr[]=new int[5]; //For Runtime user choice
     System.out.println("Enter 5 number: ");
     for(int i=0; i<5; i++)
     {
         arr[i]=new Scanner(System.in).nextInt();
     }
     //Logic
     int max=arr[0];
     int min = arr[0];
     for(int i=0; i<arr.length; i++) 
     { 
         if (max < arr[i])
	      {
	         max = arr[i];
	      }
         if(min > arr[i])
         {
            min = arr[i];
         }
     }
     System.out.println("The maximum element is "+max);
     System.out.println("The minimum element is " + min); 
  }
}