//* Use interfaces when you want to define a role that other classes can play,
//* no matter where they live in the inheritance tree

public class Interfaces {

    //* Instead of "class", we use "interface" to define an interface
    //* The "implements" keyword is used for a class to implement an interface

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sleep();
        bird.beFriendly();
    }
}

interface Pet {
    //* Their methods are always implicitly "public" and "abstract"
    void beFriendly();
}

//* Therefore, the subclass must implement the interface's methods
//! "implements" comes after "extends"
class Bird extends Animal implements Pet {
    public void beFriendly() {
        System.out.println("I'm a friendly bird");
    }
}

//* Another use of "extends" is when the relationship is between interfaces
interface Flyable extends Pet {
    void fly();
}

//* A class can also implement multiple interfaces
interface Robot {
    void doSomething();
}

class RobotBird extends Animal implements Flyable, Robot {
    public void beFriendly() {
        System.out.println("I'm a friendly robot bird");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public void doSomething() {
        System.out.println("I'm doing something");
    }
}
