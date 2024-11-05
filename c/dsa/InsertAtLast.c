//Insert a node: at last from function
#include<stdio.h>
#include<stdlib.h>
void create();
void insertAtLast();
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
	insertAtLast();
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
void insertAtLast()
{
	//for traverse
	ptr=start;
	while(ptr->next != NULL)
	{
		ptr=ptr->next;
	}
	//Method 1: Using one pointer
	ptr->next=(struct node*)malloc(sizeof(struct node));
	printf("\nEnter info (at last): ");
	scanf("%d",&(ptr->next->info));
	ptr->next->next=NULL;
	//Method 2: Using two pointer
//	struct node *ptr1 = (struct node*)malloc(sizeof(struct node));
//	printf("Enter new info: ");
//	scanf("%d",&(ptr1->info));
//	ptr->next=ptr1;
//	ptr1->next=NULL;
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
