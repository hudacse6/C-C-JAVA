
#include<iostream>
using namespace std;
void travers(int b[])
{
int i,item,k,d;
cout<<"enter number:"<<endl;
cin>>k;
for(i=0;i<5;i++)
    {
  if(k==b[i])
    {
        item=b[i];

        for(i;i<5;i++)
    {
            b[i]=b[i+1];

}}}
for(i=0;i<4;i++)
{
cout<<"number"<<b[i]<<endl;
}}

int main()
{
int a[100000],i;
for(i=0;i<5;i++)
    {
    cin>>a[i];
    }
travers(a);
return 0;
}
