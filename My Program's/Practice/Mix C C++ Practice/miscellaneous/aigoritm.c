#include<stdio.h>


void main()
{
    int i,n;
    int a[100];

    printf("\nEnter size of array");

    scanf("%d",&n);

    printf("\nEnter the elements of array\n");

    for(i = 0; i < n; i++)
        scanf("%d",&a[i]);

    printf("\nArray traversal\n");

    for(i = 0; i < n; i++)
        printf("%d ",a[i]);
}

