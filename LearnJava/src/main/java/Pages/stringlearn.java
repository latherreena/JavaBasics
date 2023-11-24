package Pages;

import java.util.Locale;

public class stringlearn {

    public static void main(String[] args) {

// f will refer to d itself
        String d = "add";
        String f = "add";
// two object refernce will be with duplicate values
        String hj = new String("sub");
        String km = new String("sub");
// lowercase and upper case
        System.out.println(hj.toLowerCase());
        System.out.println(km.toUpperCase());

// single quote in string value
        String j = new String("here we \"are\" and go");
        System.out.println(j);

 //index value of string
        System.out.println(j.indexOf("w"));

        String l = " happy for the work " ;
        String[] af = l.split(" ");
        System.out.println(af[0].trim());

        // ignore case sensitive values
        String dk = "hELoO";
        String li = "HelOO";
        String op = "happy days forever";
        System.out.println(dk.equalsIgnoreCase(li));
        System.out.println(dk.equalsIgnoreCase(op));

        for (int i= 0; i<op.length(); i++)
        {
            System.out.println(op.charAt(i));
        }
        System.out.println("656665");
        for (int k=op.length()-1; k>= 0; k-- )
        {
            System.out.println(op.charAt(k));

        }





    }
}
