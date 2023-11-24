package Pages;
import java.util.Locale;

public class loopsJava
{

    public static void main(String[] args) {

        System.out.println("Decreasing lines");

        int g3 = 1; //4  next 7, next 9
        for (int i = 0; i < 4; i++) // i= 1, i = 2, i= 3 // outer loop
        {
            // inner loop
            for (int j = 1; j <= 4 - i; j++) // 3 times increment 4-2 = 2 times loop run, 4-3 = 1 times
            {
                System.out.print(g3); // value 7+1 = 8, 8+1=9, 9+1 = 10
                System.out.print("\t"); // space in between digits
                g3++;// 7 ,  9
            }
            System.out.println(" "); // enter the next line once printed 1,2,3,4
        }

        System.out.println("increasing lines");
        int h3 = 1;
        for (int i2 = 0; i2 < 4; i2++) {
            for (int k1 = 1; k1 <= 1 + i2; k1++) {
                System.out.print(h3);
                System.out.print("\t ");
                h3++;
            }
            System.out.println(" ");

        }

        System.out.println("Multiplication of 3");
        int j = 1;
        for (int d = 0; d <= 2; d++) {
            for (int f = 1; f <= d + 1; f++) {
                System.out.print(j * 3);
                System.out.print("\t");
                j++;

            }
            System.out.println(" ");
        }
        System.out.println("square shape of 3 table");

        int y = 1;
        for (int r = 0; r <= 2; r++)
        {
            for (int s = 1; s <= 3; s++) {
                System.out.print(y * 3);
                System.out.print("\t");
                y++;

            }
            System.out.println(" ");
        }


        for (int r1 = 1; r1 <= 5; r1++)
        {
            for (int s1 = 1; s1 <= r1; s1++) {
                System.out.print(s1);
                System.out.print("\t");

            }
            System.out.println(" ");
        }

        System.out.println("&&&&&&");
       // for (int r2 = 1; r2 <= 5; r2++)
        //{
            for (int s1 = 1; s1 <= 3    ; s1++) {
                System.out.print(s1);
                System.out.print("\t");

            }
          //  System.out.println(" ");
        //}


        System.out.println("******************");
        String lj = "hELp";
        String iu = "HelP";
        String lp = "pure";
        String jm = new String(" shape of life \"Three\" table");
        System.out.println(jm);
        System.out.println(jm.indexOf("shape of "));
        String[] kl = jm.split(" ") ;
        System.out.println("#######");
        System.out.println(kl[2]); // ask for this?????
        System.out.println(lj.equalsIgnoreCase(iu));
        System.out.println(iu.equalsIgnoreCase(lp));
        for (int m = 0;  m < iu.length(); m++)
        {
            System.out.println(iu.charAt(m));
        }
        System.out.println("*****");
        for (int m1 = iu.length()-1; m1 >= 0; m1--)
        {
            System.out.println(iu.charAt(m1));
        }



    }}


