package Assignment;


/*
 *  W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
has two subclasses each having a method with the same name
'message' that prints "This is first subclass" and "This is second
subclass" respectively.
Call the methods 'message' by creating an object for each subclass.
 */


abstract class Parent {

    public abstract void message();

}


class FirstSubclass extends Parent {

    public void message() {

        System.out.println("This is first subclass");

    }

}


class SecondSubclass extends Parent {

    public void message() {

        System.out.println("This is second subclass");

    }

}


public class Quest_25 {

    public static void main(String[] args) {

        Parent obj1 = new FirstSubclass();

        Parent obj2 = new SecondSubclass();

       

        obj1.message();

        obj2.message();

    }


}
