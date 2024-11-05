//sorted & simplified polynomial
#include <stdio.h>
#include <stdlib.h>

// Define the structure for a polynomial term (node)
struct node {
    float coeff;     // Coefficient of the term
    int expo;        // Exponent of the term
    struct node *link;
};

// Function to add a new term to the polynomial
struct node* insert(struct node* head, float coeff, int expo) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->coeff = coeff;
    newNode->expo = expo;
    newNode->link = NULL;

    if (head == NULL) {
        head = newNode;
    } else {
        struct node* temp = head;
        while (temp->link != NULL) {
            temp = temp->link;
        }
        temp->link = newNode;
    }
    return head;
}

// Function to print the polynomial
void printPoly(struct node* head) {
    if (head == NULL) {
        printf("Polynomial is empty.\n");
        return;
    }
    struct node* temp = head;
    while (temp != NULL) {
        printf("(%.1fx^%d)", temp->coeff, temp->expo);
        temp = temp->link;
        if (temp != NULL) {
            printf(" + ");
        }
    }
    printf("\n");
}

// Function to sort the polynomial by exponents (in descending order)
struct node* sortPoly(struct node* head) {
    if (head == NULL) return head;

    struct node* i = head;
    struct node* j = NULL;
    float tempCoeff;
    int tempExpo;

    while (i != NULL) {
        j = i->link;
        while (j != NULL) {
            if (i->expo < j->expo) {
                // Swap the coefficients and exponents
                tempCoeff = i->coeff;
                tempExpo = i->expo;
                i->coeff = j->coeff;
                i->expo = j->expo;
                j->coeff = tempCoeff;
                j->expo = tempExpo;
            }
            j = j->link;
        }
        i = i->link;
    }
    return head;
}

// Function to simplify the polynomial by combining like terms
struct node* simplifyPoly(struct node* head) {
    if (head == NULL) return head;

    struct node* temp = head;
    struct node* nextNode;

    while (temp != NULL && temp->link != NULL) {
        if (temp->expo == temp->link->expo) {
            // Combine coefficients of the same exponent
            temp->coeff += temp->link->coeff;
            // Remove the duplicate node
            nextNode = temp->link;
            temp->link = temp->link->link;
            free(nextNode);
        } else {
            temp = temp->link;
        }
    }
    return head;
}

// Main function
int main() {
    struct node* poly = NULL;
    int n, expo;
    float coeff;

    // Input the polynomial terms
    printf("Enter the number of terms: ");
    scanf("%d", &n);
	int i;
    for (i = 0; i < n; i++) {
        printf("Enter coefficient and exponent for term %d: ", i + 1);
        scanf("%f %d", &coeff, &expo);
        poly = insert(poly, coeff, expo);
    }

    printf("\nOriginal Polynomial:\n");
    printPoly(poly);

    // Sort the polynomial by exponents
    poly = sortPoly(poly);

    printf("\nSorted Polynomial:\n");
    printPoly(poly);

    // Simplify the polynomial by combining like terms
    poly = simplifyPoly(poly);

    printf("\nSimplified Polynomial:\n");
    printPoly(poly);

    return 0;
}

