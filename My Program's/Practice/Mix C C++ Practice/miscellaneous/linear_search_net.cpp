 #include<iostream>
 #include<stdio.h>
 using namespace std;
 int main()
{

    int a[10],i,n,m,c=0;

    printf("Enter the size of an array: ");
    scanf("%d",&n);

    printf("Enter the elements of the array: ");
    for(i=0;i<=n;i++)
        {
         scanf("%d",&a[i]);
        }

    printf("Enter the number to be search: ");
    scanf("%d",&m);
    for(i=0;i<=n;i++)
        {
         if(a[i]==m)
         {
             c=1;
             break;
         }
    }
    if(c==0)
         printf("The number is not in the list");
    else
         printf("The number is found");

    return 0;
}
