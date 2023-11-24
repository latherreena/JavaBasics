package Pages;

public class SpeakerChildChild extends TVChild{

    public static void main(String[] args) {
        SpeakerChildChild sp = new SpeakerChildChild();
        sp.TVScreen();
       // boolean th = sp.TVVolume();
       // System.out.println(th);
        sp.SpeakerVolume();
    }

    public void TVScreen(){
        super.TVScreen(); // super keywords can be used with extends class only.
        System.out.println("output from speakerchildchild");
    }
}
