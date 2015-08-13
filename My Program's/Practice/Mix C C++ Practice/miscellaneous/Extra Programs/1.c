#include <stdio.h>
int main()
{
    int n,i,sum;
    for(n=1;n<=20;n++)
    {  sum=0;
        for(i=1;i<=10;i++){
           sum = sum+n;
            printf("%d * %d = %d\n",n,i,sum);}
    }
    return 0;
}
