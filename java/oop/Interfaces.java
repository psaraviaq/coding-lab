package oop;

public class Interfaces {
    //* An interface is used to define a set of methods that a class must implement
    //* Interfaces are already "abstract", so you don't need to specify it
    //* An interface is also compiled into a ".class" file
}

interface Pet {
    //* Their methods are already "public" and "abstract"
    void beFriendly();
}

//* A class "implements" an interface
class Bird implements Pet {
    @Override
    public void beFriendly() {
        System.out.println("I'm a friendly bird");
    }
}

//* An interface can extend an interface
interface Flyable extends Pet {
    void fly();
}

//! And a class can both "extend" a class and "implement" one or more interfaces at the same time
class RobotBird extends Animal implements Flyable, Robot {
    public void beFriendly() {
        System.out.println("I'm a friendly robot bird");
    }
    
    public void fly() {
        System.out.println("I'm flying");
    }
}

interface Robot {
}