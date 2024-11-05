//Create a node in Linked List
#include<stdio.h>
#include<stdlib.h>
struct node
{
	int info;
	struct node *next;
} *start=NULL, *ptr;
void main()
{
	ptr=(struct node*) malloc(sizeof(struct node));
	printf("Enter info: ");
	scanf("%d", &(ptr->info));
	ptr->next=NULL;
	start=ptr;
	printf("%d",ptr->info);
	free(ptr);
}
