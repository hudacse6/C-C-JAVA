#include <stdio.h>

int main()
{
    int num;

    for(;;)
            {
        scanf("%d", &num);

            if(num==0) break;

                    if(num%11==0)
                        {
                            printf("%d  is a multiple of 11.\n",num);
                        }
                    else
                        {
                            printf("%d is not a multiple of 11.\n",num);
                        }
            }
    }

