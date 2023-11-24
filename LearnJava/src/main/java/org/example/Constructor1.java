package org.example;

public class Constructor1 {

    int i ; // auto value 0
    String name; // auto value null
    public Constructor1() // empty constructor
    {

    }

    public Constructor1(int j)
    {
        this.i = j;
    }

    private Constructor1(int k, String Name){ // private constructor accessible within class only.
        this.i = k;
        this.name = Name;
    }

    public static void main(String[] args) {
        Constructor1 rf = new Constructor1();
        rf.add();
        Constructor1 kl = new Constructor1(8, "reen1"); // how we get string output without defining parameter in constructor
        kl.add();
        Constructor1 oi = new Constructor1(4, "reena");
        oi.add();

    }

    public void add(){
        System.out.println(i+ " " +name);
    }
}


