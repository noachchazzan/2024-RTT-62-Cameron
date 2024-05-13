package GLAB303_10_4;
/* Similar to an abstract class, an Interface cannot be instantiated
because it is incomplete (the abstract method’s body is missing). To
use an interface, you must derive subclasses and provide
implementation to all the abstract methods declared in the
interface. The subclasses are now complete and can be
instantiated.
To derive subclasses from an interface, a new keyboard "implement"
is to be used instead of "extends" for deriving subclasses from an
ordinary class or an abstract class. It is important to note that the
subclass implementing an interface needs to override ALL abstract
methods defined in the interface; otherwise, the subclass cannot be
compiled.
*/
public class Circle extends Shape implements Movable{
    protected double radius;
    private int x, y; // x and y coordinates of the point
    private final double PI = Math.PI;
    /** Constructs a MovablePoint instance at the given x and y */
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }
    @Override
    public double getArea() {
    //double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return area; //reference to parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "] ";
    }
    public String getCoordinate()
    {
        return "(" + x + "," + y + ")";
    }
    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
