package org.example;
public class InstanceVariable1 {
    //Global Values, when we assign global to local values then we can assign any value to them.
    int i = 3;
     String name = "reena" ;

    //parameter method
    public void add(int i, String name)
    {
        this.i = i;
        this.name = name;
        System.out.println(i + " " + name + " " + this.i);
    }

   // return method
    public int num(){
    return 12;
    }

   public static void main(String[] args) {
        InstanceVariable1 jk = new InstanceVariable1();
        jk.add(jk.i, jk.toString());

      }


}
