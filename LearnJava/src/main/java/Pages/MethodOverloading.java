package Pages;

public class MethodOverloading {

    public static void main(String[] args){

        MethodOverloading b = new MethodOverloading();
        display(100);
        //display('e', 2);
        //b.display(12.34556F);

    }

   public void subclass()
    {
        System.out.println("gratitude");
    }
    public String subclass(String s)
    {
       return "happy";

    }
    public int subclass(int a)
    {
     return 10;
    }
    public boolean subclass(boolean status)//ask how to get boolean output
    {
        return status;
    }

    private static void display(int a)
    {
        System.out.println("Arguments: " + a);
    }

    public char display(char a, int b){ //how different type of variable will work here
        return 'a';
    }

  /*  public float display(float g){ //ask how to get output of float value?
        return 12.3456F;
    }*/

    }

