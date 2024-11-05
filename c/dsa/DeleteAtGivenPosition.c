//Delete node at given position
#include<stdio.h>
#include<stdlib.h>
void create();
void deleteAtX();
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
	deleteAtGivenPosition();
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
void deleteAtGivenPosition()
{
	//delete node at given position
	//traverselling at given position
	ptr=start; 
	int x;
	printf("\nEnter the position: ");
	scanf("%d",&x);
	int j=1;
	while(j<(x-1))
	{
		ptr=ptr->next;
		j++;
	}
	//now ptr reach before the given position
	struct node *ptr1;
	ptr1=ptr->next;
	ptr->next=ptr1->next;
	free(ptr1);
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
