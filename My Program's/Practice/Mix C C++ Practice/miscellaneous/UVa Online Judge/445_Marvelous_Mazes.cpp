#include<iostream>
#include <stdio.h>
using namespace std;
main()
 {
    char ch;
    int num,i;
    num = 0;
    while (scanf("%c", &ch) != EOF)
        {
        if ('0' <= ch && ch <= '9')
            num += ch - '0';
        else if (ch == '!' || ch == '\n')
            putchar('\n');
        else
        {
            for ( i = 0; i < num; i++)
            {
               //putchar(ch == 'b' ? ' ' : ch);
                if(ch=='b')
                    {

                     putchar(' ');
                  }
                else
                   {
                    putchar(ch);
                   }


            }

              num = 0;
        }
    }
}
