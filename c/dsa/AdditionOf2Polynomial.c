#include <stdio.h>
#include <stdlib.h>
// Define the structure for polynomial node
struct node {
    float coeff;
    int expo;
    struct node *link;
};
// Function to insert a term into the polynomial
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
// Function to create a polynomial by taking user input
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
    printf("\nAdded Polynomial: ");
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
// Function to add two polynomials
struct node *polyAdd(struct node *head1, struct node *head2) {
    struct node *ptr1 = head1;
    struct node *ptr2 = head2;
    struct node *head3 = NULL;  // Initialize the result polynomial
    while (ptr1 != NULL && ptr2 != NULL) {
        if (ptr1->expo == ptr2->expo) {
            head3 = insert(head3, ptr1->coeff + ptr2->coeff, ptr1->expo);
            ptr1 = ptr1->link;
            ptr2 = ptr2->link;
        } else if (ptr1->expo > ptr2->expo) {
            head3 = insert(head3, ptr1->coeff, ptr1->expo);
            ptr1 = ptr1->link;
        } else {
            head3 = insert(head3, ptr2->coeff, ptr2->expo);
            ptr2 = ptr2->link;
        }
    }
    // Add remaining terms from the first polynomial
    while (ptr1 != NULL) {
        head3 = insert(head3, ptr1->coeff, ptr1->expo);
        ptr1 = ptr1->link;
    }
    // Add remaining terms from the second polynomial
    while (ptr2 != NULL) {
        head3 = insert(head3, ptr2->coeff, ptr2->expo);
        ptr2 = ptr2->link;
    }
    return head3;
}
// Main function
int main() {
    struct node *head1 = NULL;
    struct node *head2 = NULL;
    struct node *result = NULL;
    printf("Enter the first polynomial:\n");
    head1 = create(head1);
    printf("\nEnter the second polynomial:\n");
    head2 = create(head2);
    result = polyAdd(head1, head2);
    print(result);
    return 0;
}

