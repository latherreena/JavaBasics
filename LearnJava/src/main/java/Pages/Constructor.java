package Pages;

import org.example.Constructor1;

import javax.naming.Name;

//The purpose of a constructor is to construct an object and assign values to the object's members,
// we want to re-use constructor and assigning values as well
// we can use different values in the constructor
//
public class Constructor
{
    //Global variable which can be used within this class and outside of class as well.
    int x;
    String Name;
    String SurName;

    public Constructor() // empty constructor method, they are without void/return statement
    {

    }

    public Constructor(int y, String name) //parameterised constructor
    {
        this.x = y; // Assigning global variable to local variable
        this.Name = name;
    }

    Constructor(String class1, String y)// constructor with different parameter
    {
        this.Name = class1;
        this.SurName = y;
    }

    /*Private Constructor(String class1, int y)// Private constructor with different parameter
    {
        this.Name = class1;//??????????????????????
        this.x = y;
    }*/


    public static void main(String[] args) // call all functions in main method
    {
        Constructor kl = new Constructor(); //object reference of class Constructor
        kl.ConsDisplay(); //calling empty constructor

        Constructor kl1 = new Constructor(10, "happy");// passing parameter values here
        kl1.ConsDisplay(); // calling int, string constructor method

        Constructor kl2 = new Constructor("abcclass", "peace");// passing string parameter here
        kl2.ConsDisplay(); // calling string, string constructor method

        //called constructor from Constructor1 class
        //Constructor1 kl7 = new Constructor1(7, "bliss");
        //kl7.add();

    }

    public void ConsDisplay()
    {
        System.out.println(x+ " " +Name+ " "+SurName);

        // two string parameter - private constructor
    }



}
