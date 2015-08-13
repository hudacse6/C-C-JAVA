#include<iostream>
#include<stdio.h>
using namespace std;

int  add(int a,float b)
{
    int c;
    c=a+b;
    cout<<c<<"\n";
    return c;
}
main()
{
    add(10,1.2);
    add(1,0.2);
    add(1,10);
}
