#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
main()
{
    int p,h,i;
    char s[1000];
    while(gets(s))
    {
        p=0;
        h=1;
        for(i=0; s[i] ; i++)
            // if used i<s[i] in loop then UVa accepted it as Wrong answer.
        {
            if((s[i]>='A'&&s[i]<='Z')||(s[i]>='a'&&s[i]<='z'))
            {
                if(h)
                p++;
                h=0;
            }
            else
            h=1;
        }
        cout<<p<<"\n";
    }

}
