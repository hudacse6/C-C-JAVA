#include<stdio.h>
main()
{
    int LA[10],i;

    int UB=5,K=0;

    while( K<=UB )
    {
        scanf("%d",&LA[K]);

        K=K+1;
    }
    for( i=0;i<=5;i++)
    {
         printf("Traversal linear array:%d \n",LA[i]);
    }
}
