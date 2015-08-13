#include<iostream>
using namespace std;

int main()
{
 int a,flag=0;
 do
 {
  cin>>a;
  if(a<=99 && a>=(-99) && a!=42)
  {
   flag=1;
   cout<<a;
  }
 }while(flag==1);
 return 0;
}
