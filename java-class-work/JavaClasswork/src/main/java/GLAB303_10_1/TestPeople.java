package GLAB303_10_1;

public class TestPeople {
    public static void main(String args[]) {
        /* Creating instances of Person, Boy, and Girl */
        Person aPerson = new Person("Fred");
        Boy jimmy = new Boy();
        Girl betty = new Girl("Betty");

        /* Output basic information about each person */
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        /* Utilizing polymorphism to handle objects of type Person, Boy, and Girl */
        System.out.println((Person)jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println(((Person)jimmy).walk());
        System.out.println();

        System.out.println((Person)betty);
        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        /* Displaying lifespan calculations from different classes */
        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        /*
        The lifespan() method did not work in the way expected. That is because for
        class methods, method look-ups occur at compile time. The lifeSpan() method
        in the Person class is used by both the Boy and Person classes. In this case, since
        the method is static and is declared in the Person class, the ageFactor from the
        Person class is used. However, the Girl class has its own lifeSpan() method, so the
        ageFactor within the Girl class is used in that case.

        Avoiding ClassCastException by proper checking before casting
        */
        if (aPerson instanceof Boy) {
            System.out.println(((Boy)aPerson).talk());
        } else {
            System.out.println("aPerson is not an instance of Boy");
        }

        /* Demonstrating inheritance and polymorphism benefits */
        /*
         * Inheritance allows subclasses like Boy and Girl to inherit and possibly
         * override methods from the superclass Person.
         *
         * Polymorphism allows us to treat instances of Boy and Girl as instances of Person,
         * simplifying code management and improving reusability.
         */
    }
}
