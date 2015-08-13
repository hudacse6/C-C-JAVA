#include<iostream>
#include<stdio.h>
#include<algorithm>
using namespace std;
main()
{
    long hashmat,opponent;
    while(cin>>hashmat>>opponent)
    {
        if(hashmat<opponent)
        {
            printf("%d",opponent-hashmat);
        }
        else
        {
           printf("%d",hashmat-opponent);
        }
        EOF;
    }
}
