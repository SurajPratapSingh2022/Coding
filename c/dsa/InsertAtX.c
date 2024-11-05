//Insert a node: at X from function
/*
	X is reffered to any position
	This type of problem do by 2 method:
	--> count basis
	--> info search basis
	Depending on our Question, how he/she want to do insertion.
*/
#include<stdio.h>
#include<stdlib.h>
void create();
void insertAtX();
void display();
struct node
{
	int info;
	struct node *next;
}*start=NULL,*ptr;
void main()
{
	create();
	display();
	insertAtX();
	display();
}
void create()
{
	//Logic of create a node
	ptr=(struct node*)malloc(sizeof(struct node));
	printf("Enter info: ");
	scanf("%d",&(ptr->info));
	ptr->next=NULL;
	start=ptr;
	//logic of crate other 4 node
	int i;
	for(i=1; i<5; i++)
	{
		ptr->next=(struct node*)malloc(sizeof(struct node));
		scanf("%d",&(ptr->next->info));
		ptr->next->next=NULL;
		ptr=ptr->next;
	}
}
void insertAtX()
{
	//for traverse at (x-1)th node
	int x, j=1;
	printf("\nEnter the position(i.e. x): ");
	scanf("%d",&x);
	ptr=start;
	while(j < (x-1))
	{
		ptr=ptr->next;
		j++;
	}
	
	struct node *ptr1=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter info (at x): ");
	scanf("%d",&(ptr1->info));
	ptr1->next=ptr->next;
	ptr->next=ptr1;
}
void display()
{
	//display
	struct node *temp=start;
	while(temp !=NULL)
	{
		printf("%d",temp->info);
		temp=temp->next;
	}
}
