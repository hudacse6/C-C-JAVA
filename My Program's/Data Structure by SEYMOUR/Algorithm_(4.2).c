#include <stdio.h>
void main()
{
   int array[100], position, i, n, value;//n=number of element

   printf("Enter the number of elements in array:\n");
   scanf("%d", &n);

   printf("Enter %d elements:\n", n);

        for (i = 0; i < n; i++)
            {
                scanf("%d", &array[i]);
            }

    printf("Enter the position where you wish to insert an element:\n");
    scanf("%d", &position);

    printf("Enter the value do you want to insert:\n");
    scanf("%d", &value);

        for (i = n - 1; i >= position - 1; i--)//here we use the algorithm
            {
                array[i+1] = array[i];
                array[position-1] = value;
            }

   printf("Resultant array is:\n");

        for (i = 0; i <= n; i++)
            {
                printf("%d\n", array[i]);
            }
}
