//String Traversing (own its place) in Java
class Main 
{
    public static void main(String []args)
    {
        String str1="Shivam Kumar";
        String str2="";
        String arr[]=str1.split(" ");
        for(String elem:arr)
        {
            for(int i=elem.length()-1; i>=0; i--)
            {
                str2=str2+elem.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println("Before Reversing: "+str1);
        System.out.println("After Reversing: "+str2);
    }
}
