#include <cs50.h>
#include <ctype.h>
#include <stdio.h>
#include <string.h>

int main(void)
{
    //* Arrays take up "n" elements of memory, plus one for the null character
    int nums[] = {4, 8, 15};
    printf("nums: %i\n", nums[3]);

    //* Strings are arrays of characters
    char abc[] = {'a', 'b', 'c'};
    printf("abc: %c\n", abc[3]);
    string def = "DEF";
    if (def[3] == '\0')
    {
        printf("%s\n", "\\0");
    }

    //* "strlen" returns the length of a string (<string.h>)
    printf("%lu\n", strlen(abc) + strlen(def));

    //* "isupper" checks if a character is uppercase, "tolower" converts it to lowercase (<ctype.h>)
    if (isupper(def[0]))
    {
        printf("%c\n", tolower(def[0]));
    }
}