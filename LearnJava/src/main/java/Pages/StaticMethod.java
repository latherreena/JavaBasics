package Pages;

public class StaticMethod {

    int x = 200;

    public static void main(String[] args) {
        number();// can call static method directly with method name
        StaticMethod.number();// can call with class name and then method name.

        StaticMethod sm = new StaticMethod();
        sm.num();

    }

    public static void number(){
        //System.out.println(this.x); // we can not call global non static variable under static method
    }

    public void num(){
        System.out.println(this.x);// can call global variable with this keyword
        System.out.println(x); // can call global variable without this keyword
    }


}
