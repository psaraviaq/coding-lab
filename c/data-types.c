#include <stdio.h>
#include <string.h>
#include <cs50.h>

int main(void)
{
    //* Integer
    int age = 23;

    //* Character
    char letter = 'A';

    //* The "string" type is not a primitive type in C, but a library from CS50
    string name = "Pedro";
    // char name[] = "Pedro";

    //* Boolean is also from CS50
    bool is_true = true;

    //* Long integer
    long long_int = 12345654321;

    //* Float
    float pi = 3.14;

    //* Double
    double pi_double = 3.14159265358979323846;

    //* You can print variables with %d, %c, %s, etc.
    printf("%s is %d years old. %li\n", name, age, long_int);
    printf("PI is %f and %.12f\n", pi, pi_double);

    //* Plus, you can use %% to print % itself
    printf("100%%\n");

    //! "const" variables can't be changed
    const int n = 5;
    // n = 6;

    // string sentence = get_string("What's your name?: ");
    // printf("Hi %s!\n", sentence);

    //* You could also declare multiple variables at once
    int a = 1, b = 2, c = 3;
}
