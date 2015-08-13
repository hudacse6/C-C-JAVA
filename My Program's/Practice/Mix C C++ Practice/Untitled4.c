#include<stdio.h>
void main(){
unsigned int w;
float total,b;
char ch='Y';
while(1)
{
printf("enter the amount u would withdraw(c that it is multiple of 5)n");
scanf("%d",&w);

printf("enter the balance");
scanf("%d",&b);
if(b>0 && b<2000)
{
if(b>w && w%5==0)
  total=b-w-0.50;
else
   printf("enter withdraw amt as multiple of 5 and <=balcancen");
}
else
 printf("enter the balnce <2000 n >0n");
printf("do u want to continue transcation Y/Nn");
scanf("%c",&ch);
if(ch=='N'|ch=='n')
{printf("thank you ");
break;
}
}
