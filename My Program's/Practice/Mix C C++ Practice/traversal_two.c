#include<stdio.h>
void traversal(int array_data[],int N,int LB)
{
    int i;
    for(i=0; i<N; i++)
    {
        printf("Total Traversaler's: %d\n",array_data[i]);
    }
}
int main()
{
    int LB=0,N=5;
    int i;
    int array_data[10000];
    printf("Enter the value's of array:");

    for(i=0;i<N;i++)
    {
      scanf("%d",&array_data[i]);
    }
    traversal(array_data,N,LB);
    return 0;
}
