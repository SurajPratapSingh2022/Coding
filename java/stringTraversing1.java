//whole String Traversing in Java
class Main 
{
    public static void main(String []args)
    {
        String str1="Shivam Kumar";
        String str2="";
        for(int i=str1.length()-1; i>=0; i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println("Before Reversing: "+str1);
        System.out.println("After Reversing: "+str2);
    }
}