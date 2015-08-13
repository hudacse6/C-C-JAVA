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
            i=1;
     i=1;
    while(i<n-c){
    if(a[i]>a[i+1]){
            t=a[i];
    a[i]=a[i+1];
    a[i+1]=t;

    }
     i++;
}
    }
    cout<<"sorted:"<<endl;
    for(c=1;c<n;c++)
    {
        cout<<a[c]<<endl;
    }


}
