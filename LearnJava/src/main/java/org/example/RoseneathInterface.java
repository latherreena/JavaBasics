package org.example;

//Interface methods without body but default and static method should have method body
public interface RoseneathInterface {

    public void postNumber();
    public void Address();

    default void Street()
    {

    }

}
