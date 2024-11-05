//Create & display a node using funcion
#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *next;
} *start=NULL, *ptr;
void create();
void display();
void main()
{
	create();
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
void display()
{
	//for display
	ptr=start;
	while(ptr != NULL)
	{
		printf("%d",ptr->info);
		ptr=ptr->next;
	}
}
