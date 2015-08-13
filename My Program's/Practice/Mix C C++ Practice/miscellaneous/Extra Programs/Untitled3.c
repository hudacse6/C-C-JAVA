#include<iostream>>
#include<stdio.h>
using namespace std;
void large_value(int data[],int n)
{
    int i,k=64;
    cout<<"Large two is values is:";
    for(i=0;i<=data[15];i++)
    //{
        if(data[i]>k)
        //{
            k=data[i];
            cout<<k<<"\n";
            //cout<<"Large values is:"<<k;
             //break;
        //}

    //}

}
int main()
{
    int i,n=15;

      int data[15]={22,6,1,0,-34,7,-9,45,67,12,34,65,8,9,66};

      large_value(data,n);

    return 0;
}



