#include<stdio.h>
int main()
{
    int index;
    int marks;
    int grade;
    printf("Enter marks:") ;
    scanf("%d",&marks);
    index=marks/10;
    switch (index)
    {
    case 10:
    case 9:
    case 8:
        grade="Honours";
        break;
    case 7:
    case 6:
        grade="1st division" ;
        break;
    case 5:
        grade="2nd division";
        break;
    case 4:
        grade="3rd division";
        break;
    default:
        grade="fail" ;
        break;

    }
    printf("%s\n",grade);
    return 0;
}
