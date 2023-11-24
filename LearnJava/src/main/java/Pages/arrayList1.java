package Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayList in Java is used to store dynamically sized collection of elements
public class arrayList1 {

    public static void main(String[] args) {

        //Arraylist
        ArrayList<String> ar = new ArrayList<>();
        ar.add("apple");
        ar.add("grapes");
        ar.add("orange");
        ar.add("celery");
        //ar.remove("apple");
        System.out.println(ar.get(3));// to get particular index value out
        System.out.println(ar.add("carrot"));
        System.out.println("****");
        System.out.println(ar.indexOf("orange"));// it will show the position of the array variable value

        for (int i = 0; i < ar.size(); i++)
        {
            System.out.println(ar.get(i)); // to get the complete list here

        }
        // enhanced for loop
        System.out.println("**********");
        for (String l:ar)
        {
            System.out.println(l.contains("app"));
            System.out.println(l);
        }
// change arrays into arraylist
        String[] ak = {"yogurt", "test", "berries"};
        List<String> jk = Arrays.asList(ak);
        System.out.println(jk.get(1));
        System.out.println(jk); // ask for the print out???????
        System.out.println(jk.size());
        System.out.println(jk.hashCode());// ask for this too?????
        boolean pv = jk.contains("te");
        System.out.println(pv);

        // int arrays into arraylist
        Integer[] lm = {1,2,3,4,5,6,7,8};
        List<Integer> fv = Arrays.asList(lm);// ask here


    }
}