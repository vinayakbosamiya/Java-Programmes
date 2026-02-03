package strings;

public class vinay_31_method {
//    this class use without object
//    static int logic(int x,int y){
//        int z;
//        if(x>y){
//            z = x+y;
//        }else{
//            z = (x+y)*5;
//        }


//    if we use this class must be create object
      int logic(int x,int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z = (x+y)*5;
        }
        return  z;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        vinay_31_method obj = new vinay_31_method();
        int res = obj.logic(a,b);
        System.out.println("result is : " + res );

//        below method use without object
//        int c;
//        c = logic(a,b);
//        System.out.println("the value is : "+c);

    }
}
