#include<stdio.h>
int main()
{
    int a[10],n,k,LA,LB,UB=4;
    LB=0;

    
	scanf("%d",&n);

    printf("Enter the element of array: ");
        {
        }
    while(a[k]<=UB)
          {
            printf("%d",a[k]);
            LA=a[k] ;
            a[k]=a[k]+1;
          }

        printf("%d",a[k]);

       return 0;
}