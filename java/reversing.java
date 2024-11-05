import java.util.Scanner;
public class Main
{
	static public void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n,r,d=0;
		n=obj.nextInt();
		//logic for Reversing
		while(n>0){
		r=n%10;
		d=d*10+r;
		n=n/10;}
		System.out.println(+d);
	}
}
