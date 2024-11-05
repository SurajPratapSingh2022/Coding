//Create 5 node in linked List
#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *next;
} *start=NULL, *ptr;
void main()
{
	//Logic for create 1 node
	ptr=(struct node*) malloc(sizeof(struct node));
	printf("Enter info: ");
	scanf("%d", &(ptr->info));
	ptr->next=NULL;
	start=ptr;
	//Logic for create other 4 node
	int i;
	for(i=1; i<=4; i++)
	{
		ptr->next=(struct node*)malloc(sizeof(struct node));
		
		scanf("%d",&(ptr->next->info));
		ptr->next->next=NULL;
		ptr=ptr->next;
	}
	//display
	ptr=start;
	while(ptr != NULL)
	{
		printf("%d",ptr->info);
		ptr=ptr->next;
	}
}
