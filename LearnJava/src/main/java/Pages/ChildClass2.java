package Pages;

//here we are fetching abstract class, interfaces and parent class method and attributes here via
// creating object reference.we can call static methods with the class name itself.

public class ChildClass2  {

    public static void main(String[] args) {
        ChildClass1 kl = new ChildClass1();// object reference of parents class
        kl.save(); // interface method
        kl.saving(); // interface method
        kl.sun();// default method called here

        anzBankCallingInterfaces ko= new anzBankCallingInterfaces(); // object reference to access all the methods
        ko.credit();
        ko.joinAccount();




        RBI.homeloans(); //calling static method from RBI interface
        RBI1.run(); // calling static method from RBI1 interface

    }
}
