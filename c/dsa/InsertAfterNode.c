//Insert a node: after node from function
/*
	X is reffered to given info
	This type of problem do by 2 method:
	--> count basis
	--> info search basis
	Depending on our Question, how he/she want to do insertion.
*/
#include<stdio.h>
#include<stdlib.h>
void create();
void insertAfterNode();
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
	insertAfterNode();
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
void insertAfterNode()
{
	struct node *ptr1 = (struct node *)malloc(sizeof(struct node));
    printf("\nEnter new info: ");
    scanf("%d", &(ptr1->info));
    
    int x;
    printf("\nEnter given info: ");
    scanf("%d", &x);

    // Traverse list to find given info
    ptr = start;
    while (ptr != NULL && ptr->info != x) 
	{
        ptr = ptr->next;
    }
    ptr1->next = ptr->next;
    ptr->next = ptr1;
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
