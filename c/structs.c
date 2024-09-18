#include <stdio.h>
#include <cs50.h>

//* To create a new data type, we use the keyword "struct"
//* To make it reusable, we use the keyword "typedef"
//! structs are similar to objects but they don't have methods
typedef struct
{
    //* You then define the data types that make up the data structure
    string name;
    int age;

    //* At the end of the struct, you put its name
} student;

int main(void)
{
    //* You can then create a variable of the data structure
    student me;

    //* Use the dot notation to access the data structure's properties
    me.name = "Pedro";
    printf("My name is %s.\n", me.name);

    //* You can also create an array of the data structure by adding brackets after the name
    student students[2];

    students[0].name = "Brian";
    students[0].age = 19;
    students[1].name = "Charles";
    students[1].age = 20;

    for (int i = 0; i < 2; i++)
    {
        printf("%s is %i years old.\n", students[i].name, students[i].age);
    }
}

//* You can also assign the struct as a return type for a function
student create_student(string name, int age)
{
    student new_student;
    new_student.name = name;
    new_student.age = age;

    return new_student;
}