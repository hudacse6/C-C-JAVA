#include<iostream>
#include<stdio.h>
using namespace std;

main()
{
    int v,t;
    while(scanf("%d %d",&v,&t)==2)
    {
        if(v==0 && t==0)
        cout<<"0\n";
        else
        cout<<2*v*t;
    }

}

