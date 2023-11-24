package org.example;

//calling abstract class methods via object in child class.
public class childObjectAbstractClass {

    public static void main(String[] args) {
        ChildClassinheritance ch = new ChildClassinheritance();
        ch.postNumber();
        ch.Street1();
        ch.Address();
        ch.Address1();

        OrientalBayInterface.postNumber1();
    }
}
