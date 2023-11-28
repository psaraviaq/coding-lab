#include <stdio.h>
#include <cs50.h>

int main(void)
{
    int i;

    //* Do-while loops are useful when you want to refactor your code and avoid repetition
    do
    {
        //* You don't have to put this message before and inside the loop
        i = get_int("Please enter an even number: ");

    } while (i % 2 != 0);
}