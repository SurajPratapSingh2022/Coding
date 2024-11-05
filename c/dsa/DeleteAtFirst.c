//Delete a node: at start from function
#include<stdio.h>
#include<stdlib.h>
void create();
void deleteAtFirst();
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
	deleteAtFirst();
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
void deleteAtFirst()
{
	ptr=start;
	start=ptr->next;
	ptr->next=NULL;
	free(ptr);
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
