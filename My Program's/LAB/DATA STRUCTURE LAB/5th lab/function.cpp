#include<iostream>
#include<stdio.h>

using namespace std;
int push(int stack[],int top,int maxstack,int item);
main()
{
    int stack[]={1,4,5,6,7};
    int maxstack=9,top=5,item=-10;
    for(int i=1;i<=top;i++)
    {
        cin>>stack[i];
    }
    if(push(stack,*top, maxstack,item));
    {
        cout<<"overflow";
        return 0;
    }
    int push(int stack[],int top,int maxstack,int item);
    {
        if(top==maxstack)
            return 0;
        else
        {
            top=top+1;
            stack[top]=item;
            return 1;
        }
        for(int j=1;j<=top;j++)
            {
                cout<<stack[j];
            }

    }

}


