#include<iostream>
#include<stdio.h>
using namespace std;
main()
{
    int ITEM,LA[10],N=3,K=2;
     for(int t=0;t<N;t++)
     {
         cin>>LA[t];
     }
    ITEM=LA[K];
    for(int i=K ; i<N-1 ;i++)
    {
        LA[i]=LA[i+1];
    }
    cout<<"all:";
    N=N-1;
    for(int p=0;p<N;p++)
        cout<<" "<<LA[p];


}
