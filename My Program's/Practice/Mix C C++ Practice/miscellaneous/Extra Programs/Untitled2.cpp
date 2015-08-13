#include<iostream>
#include<stdio.h>
using namespace std;
main()
{
    int LA[5],K=1,N=4,item;//K=POSITION...N=element

    for(int i=0;i<=4;i++)
    {
        cin>>LA[i];
    }
     item=LA[K];
    for(int J=K ; J<=N-1; J++)
    {
        LA[J]=LA[J+1];

    }
    cout<<"DELETE ITEM:";
    N=N-1;

    for(int P=0;P<=4;P++)
    {
        cout<<" "<<LA[P];
    }


}



