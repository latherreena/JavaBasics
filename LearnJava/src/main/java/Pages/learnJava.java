package Pages;

import java.sql.SQLOutput;

public class learnJava
{
    public static void main(String[] args)
    {
        learnJava learn = new learnJava(); // created reference of leranJava class
        MethodOverloading le = new MethodOverloading(); //created object of MethodOverloading class
        String v = le.subclass("happy");
        int v1 = le.subclass(12);
        boolean v2 = le.subclass(false); // intialised value printed here from class MethodOverloading
        le.subclass();

        System.out.println();
        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);


        int a = 10;
        char c = 'e';
        boolean status = true;
        String name = "reena";

        System.out.println("integer" +a);
        System.out.println("Name:" +name);
        System.out.println("char" +c);

        learn.Add();
        sub();


    }

    public void Add()
    {
        int h = 10;
        int g = 30;
        int addition = h+g;
        System.out.println(addition);
    }
    public static void sub()
    {
        int age =10;
        int sub  = age;
        System.out.println("age :" +sub);

    }

}
