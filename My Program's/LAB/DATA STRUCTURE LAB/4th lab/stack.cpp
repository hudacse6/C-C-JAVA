#include<iostream>
#include<stdio.h>
using namespace std;
main()
{
    int stack[10]={1,4,5,6,7};
    int maxstack=9,top=4,item=-10;
    printf("Before inserted:\n");
    for(int i=0;i<=top;i++)
    {
       printf("%d ",stack[i]);
    }

    if(top==maxstack)
    {
        cout<<"overflow";

    }
    else
    {
        top=top+1;
        stack[top]=item;
        }
printf("\nafter inserted:\n");
    for(int i=0;i<=top;i++)
    {
       printf("%d ",stack[i]);
    }
}
