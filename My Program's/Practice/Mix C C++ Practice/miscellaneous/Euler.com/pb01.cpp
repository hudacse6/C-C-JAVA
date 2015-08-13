#include<iostream>
using namespace std;
main()
{
    int n,i;
    while(1)
    {
        int r=0;

        cin>>n;

        {
            for(i=0;i<n;i++)
                {
                if((i%3==0) || (i%5==0))
                    {
                        cout<<i<<"\n";
                        r+=i;
                    }


                }
                 cout<<r;
        }


    }
}

//Output:233168
