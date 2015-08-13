#include<stdio.h>
main()
{
    int LA[100],N=3,K=0,ITEM,J,L;
    J=N;
    while(J>=K)
    {
        scanf("%d",&LA[J]);
        LA[J+1]=LA[J];
        J=J-1;
        printf("=%d  \n",LA[J]);
    }
    printf("Which Position do u insert item: \n");
    scanf("%d",&LA[J]);
    printf("The value do u want to insert: \n");
    scanf("%d",&LA[J]);
    LA[K]=ITEM;
    N=N+1;
    printf("resulted insertion is: %d",N);

}
