#include<stdio.h>
#include<string.h>
int main()
{
    char a[200][200];
    int i=0,j,k,l,m,n=0,max=0;
    while(gets(a[n]))
        n++;
    for(i=0;i<n;i++)
    {
        k=strlen(a[i]);
        if(k>max)
        {
            max=k;
        }
        for(j=k;j<100;j++)
        {
            a[i][j]=' ';
        }
        a[i][100]='\0';
    }
    for(i=0;i<max;i++)
    {
        for(j=n-1;j>=0;j--)
        {
            printf("%c",a[j][i]);
        }
        printf("\n");
    }
    return 0;
}
