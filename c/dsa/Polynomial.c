#include<stdio.h>
#include<stdlib.h>

struct node {
    float coeff;
    int expo;
    struct node *link;
};

// Function to insert a term in the polynomial
struct node *insert(struct node *head, float co, int ex) {
    struct node *temp;
    struct node *newP = (struct node *)malloc(sizeof(struct node));
    
    newP->coeff = co;
    newP->expo = ex;
    newP->link = NULL;

    if (head == NULL || ex > head->expo) {
        newP->link = head;
        head = newP;
    } else {
        temp = head;
        while (temp->link != NULL && temp->link->expo > ex) {
            temp = temp->link;
        }
        newP->link = temp->link;
        temp->link = newP;
    }
    return head;
}

// Function to create a polynomial
struct node *create(struct node *head) {
    int n, i;
    float coeff;
    int expo;
    printf("Enter the number of terms in polynomial: ");
    scanf("%d", &n);
    
    for (i = 0; i < n; i++) {
        printf("Enter the coefficient for term %d: ", i + 1);
        scanf("%f", &coeff);
        printf("Enter the exponent for term %d: ", i + 1);
        scanf("%d", &expo);
        head = insert(head, coeff, expo);
    }
    return head;
}

// Function to print the polynomial
void print(struct node *head) {
	printf("\npolynomial: ");
    if (head == NULL) {
        printf("No Polynomial\n");
    } else {
        struct node *temp = head;
        while (temp != NULL) {
            printf("(%.1fx^%d)", temp->coeff, temp->expo);
            temp = temp->link;
            if (temp != NULL) {
                printf(" + ");
            } else {
                printf("\n");
            }
        }
    }
}

// Main function
int main() {
    struct node *head = NULL;
    
    head = create(head);
    print(head);
    return 0;
}

