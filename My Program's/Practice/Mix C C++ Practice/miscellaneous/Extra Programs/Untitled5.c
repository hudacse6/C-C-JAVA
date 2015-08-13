#include<stdio.h>

 main()
{

    int a, b;
    while(scanf("%d %d", &a, &b) == 2)

        printf("%d\n", a * b * 2);
    if((a>=-100) && (b<=100))

        break;

}
