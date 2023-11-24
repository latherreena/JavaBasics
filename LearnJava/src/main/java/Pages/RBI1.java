package Pages;

// interface does not have main method, interface have method without body, it only in the implementation class
public interface RBI1
{

    public void saving();

    public void save();

    default void sun(){
        System.out.println("gh");
    }
    static void run(){
        System.out.println("hj");

    }


}