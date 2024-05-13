package GLAB303_10_4;
/*
An Interface is similar to an abstract class with no fields and all
abstract methods. Interfaces cannot be instantiated — they can
only be implemented by classes. The purpose of an Interface is to
specify behavior for a class.
In other words, we can say that an Interface is a design contract. It
specifies methods and classes that can "implement" the Interface;
and thereby, sign the contract.
We will use the Shapes example in this lab.
Suppose that our application involves many shapes that can
move. We could define an interface as movable, containing
the signatures of the various movement methods
*/

public interface Movable {
    // An interface defines a list of public abstract methods to be implemented by the subclasses
    void moveUp(); // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
