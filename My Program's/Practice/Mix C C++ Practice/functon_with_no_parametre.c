#include<stdio.h>
void print_msge()
{
   int i;
   int sum=0;
    for(i=0;i<=5;i++)
    {
        sum+=i;
        printf("Sum is %d\n",sum);
    }
}
main()
{

    print_msge();
}
