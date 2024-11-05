//procedure of adding two numbers using linked list is divided into 3 parts:
	//step 1: Represent an n-digit number using a singly linked list.
	//step 2: Reverse the numbers for addition
	//step 3: Add the numbers and store the result in the resultant singly linked list.
#include <stdio.h>
#include <stdlib.h>
// Define the structure for a node
struct node {
    int data;
    struct node *link;
};
struct node *push(struct node *head, int val){
	struct node *newP=malloc(sizeof(struct node));
	newP->data=val;
	newP->link=head;
	head=newP;
	return head;
}
struct node *add(struct node *head1,struct node *head2){
	if(head1->data==0)
		return head2;
	if(head2->data==0)
		return head1;
	struct node *ptr1=head1;
	struct node *ptr2=head2;
	struct node *head3=NULL;
	int carry=0, num;
	while(ptr1 || ptr2){
		int sum=0;
		if(ptr1)
			sum+=ptr1->data;
		if(ptr2)
			sum+=ptr2->data;
		sum+=carry;
		carry=sum/10;
		sum=sum%10;
		head3=push(head3,sum);
		if(ptr1)
			ptr1=ptr1->link;
		if(ptr2)
			ptr2=ptr2->link;
	}
	if(carry)
		head3 =push(head3,carry);
	return head3;
}
// Function to reverse a linked list
struct node *reverseLL(struct node *head) {
    struct node *prev = NULL;  // Previous node
    struct node *current = head;  // Current node
    struct node *next = NULL;  // Next node

    while (current != NULL) {
        next = current->link;  // Store the next node
        current->link = prev;  // Reverse the link
        prev = current;  // Move prev to current
        current = next;  // Move current to next
    }
    return prev;  // New head of the reversed list
}

// Function to add a new node to the front of the linked list
struct node *add_node(struct node *head, int val) {
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = val;
    newNode->link = head;  // Point to the current head
    head = newNode;  // Update the head to the new node
    return head;
}

// Function to create a linked list from a given number
struct node *createLL(struct node *head, int n) {
    if (n == 0) {  // Handle the case for input 0
        return add_node(head, 0);
    }
    while (n != 0) {
        head = add_node(head, n % 10);
        n = n / 10;
    }
    return head;
}

// Function to print the linked list
void print(struct node *head) {
    if (head == NULL) {
        printf("No Number\n");
        return;
    }
    struct node *temp = head;
    while (temp != NULL) {
        printf("%d", temp->data);
        temp = temp->link;
        if (temp != NULL) {
            printf(" -> ");
        }
    }
    printf("\n");
}
void back2num(struct node *head){
	struct node *temp=head;
	printf("\nResult: ");
	while(temp){
		printf("%d", temp->data);
		temp=temp->link;
	}
	return NULL;
}
// Main function
int main() {
    int a, b;
    printf("Enter the two numbers: ");
    scanf("%d %d", &a, &b);

    // Create and print the linked list for the first number
    printf("Linked list representation of first number:\n");
    struct node *head1 = NULL;
    head1 = createLL(head1, a);
    print(head1);

    // Create and print the linked list for the second number
    printf("Linked list representation of second number:\n");
    struct node *head2 = NULL;
    head2 = createLL(head2, b);
    print(head2);

    // Reverse both linked lists
    head1 = reverseLL(head1);
    head2 = reverseLL(head2);
    
    printf("\nReversed Linked List:\n");
    print(head1);
    print(head2);

	struct node *head3=NULL;
	head3=add(head1,head2);
	printf("\nResultant linked list after addition: \n");
	print(head3);
	back2num(head3);
    return 0;
}

