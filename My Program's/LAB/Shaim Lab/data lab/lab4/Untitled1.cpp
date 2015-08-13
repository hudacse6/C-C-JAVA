#include<iostream>
using namespace std;
int main()
{
    int i,j,c,t,a[1000],n;
   cout<<"enter:"<<endl;
    cin>>n;
    cout<<"enter:"<<endl;
    for(c=1;c<n;c++)
    {

        cin>>a[c];
    }
for(c=1;c<n-1;c++){
    for(i=1;i<n-c;i++){
    if(a[i]>a[i+1]){
            t=a[i];
    a[i]=a[i+1];
    a[i+1]=t;
    }
 }

}
    cout<<"sorted:"<<endl;
    for(c=1;c<n;c++)
    {
        cout<<a[c]<<endl;
    }


}

