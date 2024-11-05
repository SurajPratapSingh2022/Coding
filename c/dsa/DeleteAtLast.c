//Delete a node: at last from function
#include<stdio.h>
#include<stdlib.h>
void create();
void deleteAtLast();
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
	deleteAtLast();
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
void deleteAtLast() 
{
    //traversing at the 2nd last node
	ptr=start;
	while(ptr->next->next != NULL)
	{
		ptr=ptr->next;
	}
	//now ptr is second last position
	struct node *ptr1;
	ptr1=ptr->next; // ptr1 is at last position	
	free(ptr1);
	ptr->next=NULL; 
}

void display()
{
	//display
	printf("\nDisplay: ");
	struct node *temp=start;
	while(temp !=NULL)
	{
		printf("%d",temp->info);
		temp=temp->next;
	}
}
