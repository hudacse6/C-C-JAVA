#include<stdio.h>
main()
{
    int a=10,b=10;
    if(a!=b)//if both side value r equal then != it will be false nd execute else statement..otherwise if both side value r not equal then execute the 1st statement ..
    {
        printf("a nd b not same");
        a=b;
    }
    else
    {
        printf("now a = to b");
    }
}
