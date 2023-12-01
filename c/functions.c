#include <stdio.h>

//* The function must be declared before it is used
void square(int n);

int main(void)
{
    square(3);
}

//* Functions are used to avoid repeating code
void square(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("#");
        }
        printf("\n");
    }
}