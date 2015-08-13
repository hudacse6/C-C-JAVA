#include<iostream>
#include<stdio.h>
 using namespace std;
 void inserting(int ar[],int n)
{
    int i,item=8,k=2;
    for(i=0;i<=n;i++)
    {
        for(i=n;i>=k;i--)
        {
            ar[i+1]=ar[i];
        }
        if(ar[k]=item)
            {
                break;
            }
    }

}
int main()
{
    int ar[100],i,n=5;
    for(i=0;i<=n;i++)
    {
        scanf("%d",&ar[i]);
    }
    inserting(ar,n);
    for(i=0;i<=n+1;i++)
    {
        printf("%d ",ar[i]);
    }
    return 0;
}

