//Calculate factorial of 5
/*Idea
	Divide the problem into smaller sub-problems
	Specify the base condition to stop the recursion
*/	
#include<stdio.h>
int fact(int n){
	if(n==1)
		return 1;
	else
		return n * fact(n-1);
}
int main(){
	int n=5;
	printf("%d",fact(5));
}
	
	
	
