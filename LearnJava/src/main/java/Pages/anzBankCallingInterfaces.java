package Pages;

//main class calling interfaces here, all the empty method will override here when we call them hence we need to implement them
// here only, the method with body does not need to override here, we can call them here with interface reference only.
public class anzBankCallingInterfaces implements RBI, RBI1 // calling RBI and RBI1 interfaces in ANZ bank class
{

    public static void main(String[] args) {
        anzBankCallingInterfaces ar = new anzBankCallingInterfaces();// class reference = class constructor
        ar.credit();
        ar.debit();
        ar.joinAccount();
        ar.saving();
        ar.bank();



        RBI jk = new anzBankCallingInterfaces();// interface reference = class constructor
        // calling interface reference with class constructor
        jk.bank(); // class won't override method with body data in this class hence it will just call here.

        RBI1 kl = new anzBankCallingInterfaces();
        kl.save();// class won't override method with body data in this class hence it will just call here.

        RBI.homeloans(); // interface name. method name accessing from RBI

    }

    @Override
    public void credit() {
        System.out.println("implementing interface method in this class here");

    }

    @Override
    public void debit() {

    }

    @Override
    public void saving() {

    }

    @Override
    public void save() {

    }

    public void joinAccount(){

    }
}
