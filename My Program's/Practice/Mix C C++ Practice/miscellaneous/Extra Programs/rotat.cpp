#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
main()
{
    int p,t;
    char k[100];
    while(gets(k))
    {
        p=strlen(k);
        t=strlen(k);

        for(int i=0;i<p;i++)

        {
             for(int j=0;j<t;j--)
             {
                 printf("%c\n",k[j]);
             }
             printf("%c\n",k[i]);
        }

        cout<<"\n";
    }
}
