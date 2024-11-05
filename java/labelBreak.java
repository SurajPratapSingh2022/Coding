//Label break in Java
class Main
{
    public static void main(String args[])
    {
        coc:for(int i=1;i<=5;i++)
        {
            bscit:for(int j=1;j<=5;j++)
            {
                if(j==3)
                  break coc;
                System.out.println(i+" "+j);
            }
        }
    }
}