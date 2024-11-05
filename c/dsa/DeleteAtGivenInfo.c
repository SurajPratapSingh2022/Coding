//Delete node at given info
#include<stdio.h>
#include<stdlib.h>
void create();
void deleteAtGivenInfo();
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
	deleteAtGivenInfo();
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
void deleteAtGivenInfo()
{
    //now we do delete node at given info
	//traversing before node at this info
	ptr=start;
	int x;
	printf("\nEnter the info: ");
	scanf("%d",&x);
	while(ptr->next->info != x)
	{
		ptr=ptr->next;
	}
	struct node *ptr1;
	ptr1=ptr->next;	//ptr1 denotes given node
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
