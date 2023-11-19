#include <stdio.h>
#include <string.h>
#include <cs50.h>

int main(void)
{
    //* Integer
    int age = 23;

    //* Character
    char letter = 'A';

    //* Boolean
    bool is_true = true;

    //* The "string" type is not a primitive type in C, but a library from CS50
    string name = "Pedro";
    // char name[] = "Pedro";

    //* You can print variables with %d, %c, %s, etc.
    printf("%s is %d years old\n", name, age);

    //* Plus, you can use %% to print % itself
    printf("100%%\n");

    //! "const" variables can't be changed
    const int n = 5;
    // n = 6;

    // string sentence = get_string("What's your name?: ");
    // printf("Hi %s!\n", sentence);
}
