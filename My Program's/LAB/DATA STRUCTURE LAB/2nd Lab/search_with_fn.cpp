#include<iostream>
#include<stdio.h>
using namespace std;
void search_item(int LA[],int N,int LB,int item)
{
    int i;
    for(i=LB; i<N; i++)
    {
        if(item==LA[i])
        {
            printf("Item found in position:%d\n",i+1);
            //break;
        }

    }
}
int main()
{
    int LB=0,LA,N=5,item=2;

    int i;
    int array_data[10000];
    printf("Enter the value's of array:");

    for(i=0;i<N;i++)
    {
      scanf("%d",&array_data[i]);
    }
    search_item(array_data,N,LB,item);
    return 0;
}



