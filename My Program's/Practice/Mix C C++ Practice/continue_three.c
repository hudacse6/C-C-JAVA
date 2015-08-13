#include<stdio.h>
main()
{
    int j;

    for ( j=0; j<=8; j++)
     {
         if (j==4)
        {
          continue;//for using continue it skip the the value of 4
        }

         printf(" %d ", j);
     }
}



