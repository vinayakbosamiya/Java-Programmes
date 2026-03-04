package OOP_Inheritance;

interface camera {
    void takeSnap();
    void RecordVideo();
//    this is the default method and may be override
    default  void video4k(){
        greet();
        System.out.println("Recording 4k Video....");
    }
    private void greet(){
        System.out.println("Welocme to java repo !");
    }
}

interface wifi {
    String[] getNetwork();

    void connect(String network);
}


class Phone {
    public void pickCall() {
        System.out.println("connecting...");
    }
//


}

class SmartPhone extends Phone implements wifi,camera{
    public void takeSnap() {
        System.out.println("Taking Snap ");
    }

    public void RecordVideo(){
        System.out.println("Taking Snap");
    }

    public String[] getNetwork(){
        System.out.println("Getting List of Networks");
        String[] netList = {"111","222","333"};
        return netList;
    }
    public void connect(String net){
        System.out.println("Connecting to " + net);
    }

}

public class vinay_56_DefaultMethods {

    static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        String[] ar = ms.getNetwork();
        for(String item:ar){
            System.out.println(item);
        }
        ms.video4k();
    }
}
