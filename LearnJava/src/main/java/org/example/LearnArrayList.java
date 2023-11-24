package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayList in Java is used to store dynamically sized collection of elements
public class LearnArrayList
{
    public static void main(String[] args)
    {
        LearnArrayList tr = new LearnArrayList();
        tr.arrayList1();
    }

    public void arrayList1() {
        ArrayList<String> kl = new ArrayList<String>();
        kl.add("peace");
        kl.add("purity");
        kl.add("love");
        kl.add("happiness");
        kl.add(2, "Power");


       // System.out.println(kl.get(1));
       // System.out.println(kl.add("kindness"));


        for (String h : kl)
        {
           // System.out.println(h.charAt(0));
            if(h.contains("happy"))
            System.out.println("" +h);
            else {
                System.out.println(""+h);
            }
        }

        //convert arraylist into arrays

        String[] pl = {"df", "gh"};
        List<String> op = Arrays.asList(pl);
        System.out.println(op.contains("gh"));// here it gives output true with full name of the string where
        // in arrays, it gives output with one character too.
        System.out.println(op.get(0));
        System.out.println(op.size());


        ArrayList<Integer> lp = new ArrayList<>();
        lp.add(8);
        lp.add(0, 34);

        for (Integer k : lp)
        {
            System.out.println(k);
        }

        Integer[] op1 = {1,2,3,4,5,};
        List<Integer>  op2 = Arrays.asList(op1.length);
        System.out.println(op2.size());

    }


}
