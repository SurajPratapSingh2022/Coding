import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n;
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			r=n%10;
			d=r^i;
			n=n/10;
		}
		System.out.println(+n);
	} 
}