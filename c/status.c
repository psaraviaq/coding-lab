#include <stdio.h>

//* Exit codes are integers that indicate the status of a program
//* You can use "echo $?" to see the exit code of the last program you ran
int main(void)
{
    printf("Hello, world\n");

    //* Return 0 to indicate success
    // return 0;

    //* Any other integer indicates an error
    return 1;
}
