//Print 1 to 100 in row(each 10) & column(each 10) format in Java
public class Main
{
	public static void main(String[] args) 
	{
		int j;
		for(int i=1; i<=100; i=i+10)
		{
		    for(j=i; j<(i+10); j++)
		        System.out.print(j+"\t");
		    System.out.println("");
		}
	}
}
