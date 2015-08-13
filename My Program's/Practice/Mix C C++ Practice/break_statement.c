#include<stdio.h>
main()
{
    float n;
    while(1)
    {
        scanf("%f",&n);
        if(n<=0.0)
            break;
        printf("%f\n",sqrt(n));
    }
}
