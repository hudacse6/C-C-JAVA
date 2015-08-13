#include<iostream>>
#include<stdio.h>
using namespace std;
void large_value(int data[],int n)
{
    int i;
    cout<<"Large two is values is:";
    for(i=0;i<=15;i++)
    {
        if(data[i]>data[0])
        {
            data[0]=data[i];
            //cout<<data[0]<<"\n";
        }
        //cout<<data[0]<<"\n";
    }
    cout<<data[0]<<"\n";

}
int main()
{
    int i,n=15;

      int data[15]={22,6,1,0,-34,7,-9,45,67,12,34,65,8,9,66};

      large_value(data,n);

    return 0;
}



