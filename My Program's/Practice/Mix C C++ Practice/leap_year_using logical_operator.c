#include<stdio.h>
int main()
{
    int year;
    printf("years:");
    scanf("%d",&year);
    if( (year%400==0) || (year%4==0 && year%100==0) )
        printf("not leap year %d",year);
    else
    {
        printf("leap year %d",year);
    }
    return 0;

}
