//passing 2d array (from non static function within class) in Java
class Main
{
	void prod(int a[][])
	{
	    int p=1;
	    for(int i=0; i<a.length; i++)
	    {
	        for (int j=0; j<a[i].length; j++)
	        {
	            p*=a[i][j];
	        }
	    }
	    System.out.println("product is "+p);
	}
	public static void main(String args[])
	{
	    int x[][]={{2,3},{4,5}};
	   // Main obj=new Main();
	   // obj.prod (x);
	    new Main().prod(x);
	}
}
