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



public class vinay_59_Polymorphism_In_Interface {
    static void main(String[] args) {
/*
    this is same as
    --> if you give your smartPhone to others for take photos It means you open camera and you given phone to others and that person does't able to
    open other anything application only must be use camera in smartPhone

    camera c = new SmartPhone(); and in this object "SmartPhone" is Your phone and "camera" is your Smartphone's camera application
    it means we use only camera app in smartPhone
*/

        camera c = new SmartPhone(); // in this use only camera methods because I create runtime polymorphism
//        c.getNetwork()  // --> this is not allowed because we use smartphone class as camera it means only use camera methods
        c.RecordVideo();
        c.video4k();
    }
}
