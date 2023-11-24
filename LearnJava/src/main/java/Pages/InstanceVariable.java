package Pages;

import org.example.InstanceVariable1;

public class InstanceVariable
{
    int a =2; // non - static global variable
    static int b ;// static global variable, system created a copy of object instance when we give static keyword.
    String name = "Twelve";
    int num(){
        return 12;
    }

    public static void main(String[] args)
    {
        /*InstanceVariable kl = new InstanceVariable();
        kl.addTwoNumber(20, 9); // assigned values to global variables here.
        kl.addTwoNumber("reena", 2);
        System.out.println(kl.name);*/

       InstanceVariable1 nj = new InstanceVariable1();
        nj.add(6, "tthis year");

    }

    void addTwoNumber( int b, int c)
    {
        System.out.println(b+c+this.name);// global variable called here
        System.out.println(b+c+this.num());// global method used here.

    }

    void addTwoNumber(String name, int u)
    {
        name = "happy";
        u = 20;
        name = this.name;
        System.out.println(name);


        // we are calling global variable within the method.
        // we cant use this keyword in the main method.
        // to call global variable in main method use object reference.


    }

}
