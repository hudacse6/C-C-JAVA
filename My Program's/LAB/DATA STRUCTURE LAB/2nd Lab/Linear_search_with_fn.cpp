#include<iostream>>
#include<stdio.h>
using namespace std;
void search(int b[],int n)
{
    int i,k;
    cout<<"search a number:"<<endl;
    cin>>k;
    for(i=0;i<n;i++)
    {
        if(k==b[i])
        {
            cout<<"number:"<<b[i]<<"  in  "<<"position:"<<i;
             break;
        }

    }
     if(i==n)

            cout<<"not found";

}
int main()
{
    int b[1000],i,n;
    cout<<"Enter number:";
    cin>>n;
    cout<<"Enter:";
    for(i=0;i<n;i++)
    {
        cin>>b[i];

    }
    search(b,n);
    return 0;
}
