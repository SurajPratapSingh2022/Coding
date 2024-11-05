import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,b,c;
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		/* 
		for calculating hcf
		1) find lowest number among them (& thats number store in a variable say hcf)
		2) then number is divisible by that least number & check remainder is not zero for all
		*/
		int hcf;
		hcf=a<b && a<c?a:(b<c?b:c);
		while(a%hcf!=0 || b%hcf!=0 || c%hcf!=0)
		   --hcf;
		System.out.println("hcf is "+hcf);
		/*
		for calculating lcm
		1) find greatest number among them (& thats number store in a variable say lcm)
		2) then greatest number can be divisible by each number & check remainder is not zero for all
		*/
		int lcm;
		lcm=a>b && a>c?a:(b>c?b:c);
		while(lcm%a!=0 || lcm%b!=0 || lcm%c!=0)
		   lcm++;
		System.out.println("lcm is "+lcm);
	}
}
