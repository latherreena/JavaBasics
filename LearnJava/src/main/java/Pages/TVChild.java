package Pages;

public class TVChild extends ElectronicParent {

    public void TVScreen(){
     super.TVScreen(); // super keywords can be used with extends class only.
        System.out.println(" output from TVChild");
    }

    public boolean TVVolume()
    {
        return true;
    }
}
