package Pages;

// we can call constructor in other classes as well likes method overloading
public class CallConstructor {

    public static void main(String[] args) {

        // we can not access private constructor from constructor class

        Constructor jk = new Constructor("reena", "lather");
        jk.ConsDisplay();

        Constructor op = new Constructor();

        Constructor kl = new Constructor(10, "reena");


    }
}
