package Pages;

public class StaticVariable {

    // difference between static and non- static variable
    int x; // global non- static variable
    static int y; // global static variable, it keeps the memory as it is when we call it via object reference

    void number() // method to print x and y
    {
       x++;
       y++;
        System.out.println("print" +x + y);
    }

    public static void main(String[] args) // main method to call all the functions here
    {
       StaticVariable jk = new StaticVariable(); // created first object reference
        jk.number(); // output will be 1 1 as per number method


        StaticVariable kl = new StaticVariable();// created second object
        kl.number(); // output will be 1, 2
        kl.number(); // output will be 2, 3
        kl.number(); // output will be 3, 4


        StaticVariable op = new StaticVariable();
        op.number(); // output will be 1, 5
        op.number(); // output will be 2, 6

    }



}