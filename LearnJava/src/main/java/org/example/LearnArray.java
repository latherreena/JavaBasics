package org.example;

public class LearnArray {

    public void array1() {
        String[] jk = {"happy forver"};

        for (String p : jk) {
            System.out.println(p);
            System.out.println(p.indexOf('f'));
            System.out.println(p.length());
        }

       /* int[] lp = {1, 2, 3, 4};
        for (int h : lp) {
            if (h % 2 == 0) {
                System.out.println("even number" + h);
            } else {
                System.out.println("odd num" + h);
            }
        }*/
        String[] lp1 = {"cars", "flowers", "plants", "trees", "nature"};
        for (String h1 : lp1) {
            if (h1.contains("cars")) {
                System.out.println("print" + h1);
            } else if(h1.contains("trees")){
                System.out.println("Print" + h1);
            } else if (h1.contains("plants")) {
                System.out.println("" +h1);

            }
            else {
                System.out.println("jk" +h1);
            }

        }

    }

        public static void main (String[]args){

            LearnArray gh = new LearnArray();
            gh.array1();

            Constructor1 cs = new Constructor1(5);//??????????????????????
           cs.add();


        }
    }

