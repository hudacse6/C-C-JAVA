
#include<iostream>
#include<stdio.h>

using namespace std;
int main()
{
    int a[100],beg,mid,end,i,n,num;
    cout<<"Enter the size of an array:";
    cin>>n;
    cout<<"Enter the value in according order::";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"Enter value you want to search:";
    cin>>num;
    beg=0;
    end=n-1;
    mid=(beg+end)/2;
    while(beg<=end)
    {
        if(a[mid]<num)
           beg=mid+1;

        else if (a[mid]==num)
            {
                cout<<"item found in position:"<<(mid+1);
                break;
            }

        else
            end=mid-1;
            mid=(beg+end)/2;
    }
    if(beg>end)
        {
           cout<<"item not found----";
        }


    }

