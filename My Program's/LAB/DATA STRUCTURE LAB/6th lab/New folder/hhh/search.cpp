#include<iostream>
#include<stdio.h>
using namespace std;

int search(int data[] ,int link[] ,int start ,int item,int loc)
{

    int ptr=start;

    while(ptr !=0)
    {
        if(item==data[ptr])
        {
            loc=ptr;
            return loc;
        }
        else
        ptr=link[ptr];


    }
    loc=0;
    return loc;
}
int main()
{
     int i;
     int start=3,link[7]={0,6,5,1,0,0,4};
     int data[7]={0,2,0,1,4,0,3};
     int item=36,loc=0;




   loc=search(data,link,start,item,loc);
   if(loc==0)
   {
      printf("Not");
   }
   else
   {
        printf("Found at %d position",loc);;
   }


    return 0;
}
