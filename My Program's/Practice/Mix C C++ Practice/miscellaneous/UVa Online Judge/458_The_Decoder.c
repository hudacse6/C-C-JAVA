#include<stdio.h>
#include<string.h>
main()
{
    int p,i;
    char s[300];
    while(gets(s))
        {
            p=strlen(s);
            for(i=0;i<p;i++)
            {
              printf("%c",s[i]-7);

            }
            printf("\n");
        }

}
