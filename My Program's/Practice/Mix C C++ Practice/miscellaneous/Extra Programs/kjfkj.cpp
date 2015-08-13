#include<iostream>
using namespace std;
int sort(int n[])
{
    int i,j,t;
    for(i=0;i<15;i++)
     for(j=0;j<15-1;j++)
       if(n[j]>n[j+1])
            {
                t=n[j];
                n[j]=n[j+1];
                n[j+1]=t;
            }
    cout<<"largest two value:"<<endl;
  for(i=13;i<15;i++)
    {
         cout<<n[i]<<" ";
    }
}

int main()
{
    int b[15]={22,6,1,0,-34,7,-9,45,67,12,34,65,8,9,66};
    sort(b);
    return 0;

}
