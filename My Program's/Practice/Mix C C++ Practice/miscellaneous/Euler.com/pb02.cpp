#include<iostream>
#include<stdio.h>
using namespace std;
main()
{
    int fib,sum=0,f=0,s=1,n;
    long int  r=0;
    cout<<"Fib number:";
    cin>>n;
    for(int i=0;i<=n;i++)
    {
        if(i<=1)
            fib=i;
        else
        {
            fib=f+s;
            f=s;
            s=fib;
        }
        if(fib%2==0)
            {
                    if(fib>4000000)
                        {
                            break;
                        }
                    cout<<fib<<" ";
                    r+=fib;
            }
                //printf("%d",i);

    }
    printf("%d",r);
}
