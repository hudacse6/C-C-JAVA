#include<iostream>
#include<stdio.h>
using namespace std;
main()
{
    int stack[10]={1,2,9,8};
    int maxstack=7,top=4,item=5;
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
