#include <stdio.h>

//* int main(int argc, string argv[])

//* When you run a program, you can pass arguments to it
//* "argc" is the number of arguments passed, "argv" is always an array of strings containing the arguments
//! There's always at least one argument, the name of the program itself
int main(int argc, char *argv[])
{
    if (argc == 2)
    {
        printf("Hello, %s\n", argv[1]);

        //* You can also access individual characters of an argument
        printf("The first letter of your name is %c\n", argv[1][0]);
    }
    else
    {
        printf("Hello, world\n");
    }
}