package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    int i;
    String name;

    public static void main(String[] args) throws InterruptedException {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here");



        try{
            int df = sc.nextInt(); // getting integer value from user
            System.out.println("output" +df);
            int a = df % 0;
            System.out.println(a);

            //compare two strings and if it failing then capture the exception
        }
        /*catch(ArithmeticException e){
            System.err.println("number can't be devided by 0");        }
        catch  (InputMismatchException e){
            System.err.println("data type not matching");
        }*/
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        finally {
            sc.close();
        }
        System.out.println("completed");


        Thread.sleep(2000);// asking java to stop execution for 2sec
    }

}