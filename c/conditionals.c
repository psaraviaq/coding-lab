#include <stdio.h>
#include <cs50.h>

int main(void)
{
    char c1 = 'a';
    char c2 = 'a';

    //* You can compare characters in C
    if (c1 == c2)
    {
        printf("c1 and c2 are equal\n");
    }
    else
    {
        printf("c1 and c2 are not equal\n");
    }

    //* The "switch" statement is available in C
    switch (c1)
    {
    case 'a':
        printf("c1 is a\n");
        break;
    case 'b':
        printf("c1 is b\n");
        break;
    default:
        printf("c1 is neither a nor b\n");
    }

    //* The "ternary" operator is also available in C
    int x = 5;
    string number = (x % 2 == 0) ? "even" : "odd";
    printf("x is %s\n", number);
}