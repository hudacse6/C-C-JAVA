#include <stdio.h>
int main()
{
    int i,j,temp;
    int data[15]={22,6,1,0,-34,7,-9,45,67,12,34,65,8,9,66};


    for(j=0;j<15;j++)
    for(i=0;i<15-1;i++)
    {
        if(data[i]>data[i+1])
        {
            temp=data[i];
            data[i]=data[i+1];
            data[i+1]=temp;
        }
    }


    printf("by bubble sort: ");
    for(i=0;i<15;i++)
         printf("%d  ",data[i]);
    return 0;
}
