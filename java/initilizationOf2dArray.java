//intialization of 2d Array 
public class Main
{
	public static void main(String[] args) 
	{
// 		int [][]x;
// 		x=new int[3][4];
// 		int x[][]={{4,53,35,78},{93,23,80,65},{12,63,49,43}};
		int x[][]=new int[][] {{4,53,35,78},{93,23,80,65},{12,63,49,43}};
		//For Using Length Property
// 		for(int i=0; i<x[0].length; i++)
// 		{
// 		    System.out.println(x[0][i]+"\t"+x[1][i]+"\t"+x[2][i]);
// 		}
		//For for-each loop
		for(int i=0;i<=2 ; i++)
		{
		    for(int a:x[i])
	        {
		    System.out.print(a+" ");
	       	}
	       	System.out.print("\n");
		}
	}
}
