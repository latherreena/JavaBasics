package Pages;

// interface does not have main method, it only in the implementation class
public interface RBI
{
    public void credit();
    public void debit();

    default void bank()
    {
        System.out.println("call in another class using object");
    }

    static void homeloans()
    {
        System.out.println("call this in class direct with interfacename. this method name");
    }
}
