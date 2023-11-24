package org.example;

public class StringClass {

    public static void main(String[] args)
    {
        //nm1 will refer to nm only, won't create two values in the memory
        String nm = "Reena123ty";
        String nm1 = "Reena1";

        // two objects can be with duplicate values
        String kl = new String("re");
        String kl1 = new String("re");

        String[] jk = {"you", "are", "beautiful"};
        String jk1 = "you are beautiful";

        System.out.println("******");
        System.out.println(nm.compareTo(nm1));//this checks number of characters are mathcing, if 0 output then matching.

        System.out.println(nm1+" " +kl+ " " +kl1);
        System.out.println(nm.toUpperCase());
        System.out.println(jk.length);
        System.out.println(jk1.equals(nm));
        System.out.println(jk1.replace("are", "can be"));
        System.out.println(jk1.replaceAll("u","k" ));
        System.out.println(jk1.replaceAll("beautiful", "pure"));
        System.out.println(nm.equalsIgnoreCase(nm1)); // ignore case sensitive values
        System.out.println(jk1.indexOf('t'));
        System.out.println(jk1.charAt(11));


        for (int i = 0; i<jk1.length(); i++)
        {
            System.out.println(jk1.charAt(i));
        }

        for (int k=jk1.length()-1; k>=0; k--)
        {
            System.out.println(jk1.charAt(k));
        }

    }

}
