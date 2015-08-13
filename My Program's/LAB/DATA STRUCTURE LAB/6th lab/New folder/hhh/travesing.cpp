#include<iostream>
#include<stdio.h>
using namespace std;


int main()
{
    int data[7]={0,2,0,1,4,0,3},start=3,link[7]={0,6,5,1,0,0,4};
    int ptr=start;
    while(ptr!=0)
    {
        printf("%d ",data[ptr]);
        ptr=link[ptr];

    }
    return 0;
}
