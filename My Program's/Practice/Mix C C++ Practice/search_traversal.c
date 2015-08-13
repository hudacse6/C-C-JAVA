#include<stdio.h>
int main()
{
    int A[200],K=0,UB=5,item=2;

    printf("Enter the elements in array: \n");

    for(K=0;K<UB;K++)
        {
                printf("Please Enter the element:");
                scanf("%d",&A[K]);
        }

    printf("The Traverse of array is:\n");

    for(K=0;K<UB;K++)
    {
            if(item==A[K])

             printf("Item found in position:%d\n",K+1);
    }
return 0;
}

