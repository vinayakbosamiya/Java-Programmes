package OOP_Inheritance;
// below camera interface if we add the new method that method must be override in chiled class if we not override (add body of method) throw error so i will use default method using default keyword
// because default method allowed to add body at interface and that method may be override at chiled class it means not compulsory to override it means may be override at child class
interface camera {
    void takeSnap();
    void RecordVideo();
//    this is the default method and may be override
    default  void video4k(){ // defalt method may be override at child class
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

