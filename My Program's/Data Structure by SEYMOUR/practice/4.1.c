#include<stdio.h>
main()
{
    int LA[100],UB=3,LB=0;
    int K=LB;//initialize counter
    while(K<=UB)//here step 8,9 ,10 repeated
    {
        scanf("%d",&LA[K]);
        printf("Traversaling Value:%d\n",LA[K]);//visit element
        K=K+1;//increase counter
    }
}
