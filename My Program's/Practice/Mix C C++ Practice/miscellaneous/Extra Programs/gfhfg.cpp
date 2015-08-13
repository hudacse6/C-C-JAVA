#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{

		int arr[]={1,3,45,5,6};

		for (int i = 0; i <5 ; i++)
		{

            if ( arr[0] < arr[i] )
                {

                    arr[0]=arr[i];
                }


        }
		cout<<arr[0];


	return 0;
}
