package org.example;
//Interface methods without body but default and static method should have method body
public interface OrientalBayInterface {

    public void Address1();
    public String Street1();

    static void postNumber1()

    {
        System.out.println("staticMethod");
    }
}
