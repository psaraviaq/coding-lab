//* Solution --> Projects

//^ The ".sln" file contains a list of all the projects in the solution

//^ Each project has a ".csproj" file, which contains information
//^ about the project in order to build it and run it

//^ The "bin" folder contains the compiled code and executable files
//^ The "obj" folder contains temporary files used to build the project

//& "dotnet run": Use this command inside the project folder

//~ You don't need to create a class to run a program
// Console.WriteLine("Hello, World!");

//~ But you can create a class to run it
//* Namespaces help to avoid naming conflicts between classes
namespace First
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }
}
