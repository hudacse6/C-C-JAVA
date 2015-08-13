#include<iostream>
#include<stdio.h>
using namespace std;
int delete_item(int b[])
{
    int i,item,k;
    cout<<"Enter the number do you want to delete:";
    cin>>k;
    for(i=0;i<5;i++)
    {
        if(k==b[i])
        {
            item=b[i];

            for(i;i<5;i++)
            {
                b[i]=b[i+1];
            }
        }

    }

    cout<<"After deleting the elements of the array is:\n";
    for(i=0;i<4;i++)
    {

        cout<<b[i]<<" ";
    }
    return 0;
}

main()
{
    int a[100000],i,n;
    cout<<"Enter the elements of an array:";

    for(i=0;i<5;i++)
    {
        cin>>a[i];

    }
    delete_item(a);

}
