#include<stdio.h>
main()
{
    int LA[100],UB=3,LB=0;
    int K=LB;//initialize counter
    while(K<=UB)//here step 8,9 ,10 repeated
    {
        scanf("%d",&LA[K]);
        printf("Traversing Value:%d\n",LA[K]);//(visit element)Apply Process
        K=K+1;//increase counter
        //End of step 6 loop
        //Exit
    }
}
