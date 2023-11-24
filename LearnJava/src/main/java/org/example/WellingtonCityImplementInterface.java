package org.example;
// implementing interface here, overriding interface methods here, but in this class we can
// write its own funtions also
public class WellingtonCityImplementInterface implements OrientalBayInterface, RoseneathInterface

{
    public static void main(String[] args) {


        WellingtonCityImplementInterface wc = new WellingtonCityImplementInterface(); //class reference = class constructorzz
        wc.Address();
        wc.Address1();
        wc.postNumber();
        wc.Street1();
        wc.Street();

        //Calling static method from interface
        OrientalBayInterface.postNumber1();


    }

    @Override
    public void Address1() {
        System.out.println("address1");

    }
    @Override
    public String Street1() {
        return null;
    }

    @Override
    public void postNumber() {

    }

    @Override
    public void Address() {

    }




}
