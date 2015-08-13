#include <stdio.h>



int main()
{
    char ch;
    int num;
    int i;
    num = 0;
    while (scanf("%c", &ch) != EOF) {
        if ('0' <= ch && ch <= '9')
            num += ch - '0';
        else if (ch == '!' || ch == '\n')
            putchar('\n');
        else {
            for (i = 0; i < num; i++)
                putchar(ch == 'b' ? ' ' : ch);
            num = 0;
        }
    }

    return 0;
}
