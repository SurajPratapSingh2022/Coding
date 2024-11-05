//String Pangram Program in Java
class Main 
{
    public static void main(String[] args) 
    {
        boolean flag=false;
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str=str.replace(" ","");
        char []ch=str.toCharArray();
        int ar[]=new int[26];
        
        for(int i=0; i<ch.length; i++)
        {
            ar[ch[i]-65]++;
        }
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]==0)
            {
                System.out.println("String is not Pangram");
                flag=true;
            }
        }
        if (flag==false) 
        {
            System.out.println("String is Pangram");
        }
    }
}
