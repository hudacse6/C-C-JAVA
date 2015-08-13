#include<stdio.h>

void bubble(int ar[],int n,int l)
{
    int i,c,temp;
    for(c=l; c<=n;c++)
    {
            for(i=l-1;i<=n-c+1;i++)
      {
                if(ar[i]>ar[i+1])
         {
            temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
         }
       }
     }
}

int main()
{
    int ar[]={22,6,1,0,-34,7,-9,45,67,12,34,65,8,9,66},l=3,i,n=15;
    bubble(ar,n,l);
    for(i=0;i<n;i++)
    printf("%d ",ar[i]);
    return 0;
}
