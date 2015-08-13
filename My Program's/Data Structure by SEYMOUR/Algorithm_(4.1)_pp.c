#include<stdio.h>
int main()
{
    int a[10],n,k,LA,LB,UB=5;
    LB=0;
    printf("\nEnter size of array: ");
    scanf("%d",&n);

    printf("Enter the element of array: ");    for(k=0;k<=n;k++)
        {            scanf("%d",&a[k]);
        }
    while(k<=UB)
          {
            printf("%d",k);
            LA=k ;
            k=k+1;
          }

        printf("%d\n",k);

       return 0;
}

