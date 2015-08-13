#include<iostream>
using namespace std;
main()
{
    int i;
    cout<<"\nEven number :";
    for(i=1;i<=50;i++)
    {
        if(i%2)//odd
            continue;
        cout<<i<<" ";
    }
    cout<<"\nodd number:";
    i=0;
    while(i<50)
    {
        i++;
        if(!(i%2))//even
            continue;
        cout<<i<<" ";
    }
}
