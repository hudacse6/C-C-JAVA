#include<stdio.h>
main()
{
    int a=5,b=6,c=7;
    printf("a   b   c\n");
    printf("-----------\n");
    while(--a,--b,--c)//not using semicolon it print avobe  the 0 (--c)value

        printf("%d  %d  %d\n",a,b,c);

}
