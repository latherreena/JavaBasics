package Pages;

//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
public class Array1
{
    public static void main(String[] args)
    {
        Array1 hj = new Array1();
        hj.arraynum();
    }
    public void arraynum() {
        int[] d = new int[5];
        d[0] = 1;
        d[1] = 2;
        d[2] = 4;
        d[3] = 7;
        d[4] = 8;

        for(int j : d)
        {
            System.out.println(j);
        }
        //System.out.println(d[3]);


        //String[] gh = {"sellenium learn"};
        int[] df = {1,2,3,4,5};
       String[] gh = {"learning java video"};

        String[] ap = {"Cars", "Bus", "Trains",};
        String[] lo = {"happy to be here"};

        for (int i = 0; i < gh.length; i++)
        {
            // System.out.println(gh[i]);
            System.out.println("****");
        }
        for (String lr : lo) {
            System.out.println("length of array values " +lr.length());// how to get output of the whole array list, do we get print out one by one?
            System.out.println("test" +lr.contains("h"));
            System.out.println(" values " + lr.indexOf('t')); // find the location of index, how about if we need all of the values out together from arraylist

        }
        int[] r1 = {1, 3, 5, 6, 7, 8, 91, 2, 3, 4, 5, 6};

        for (int h : r1) {
            if (h % 2 == 0) {
                System.out.println("prime number" +h);

                //break; // due to performance issues we use this statement
            }
            else {
                System.out.println("not prime number" + h);
            }
        }

    }
}


