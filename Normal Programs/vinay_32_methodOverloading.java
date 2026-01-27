public class vinay_32_methodOverloading {
    static void change(int [] a){
        a[0]=44;
    }
    static void change(){
        System.out.println("i am change function");
    }
    static void main(String[] args) {
        int marks[] = {1,2,2,3,4}; //it is an array object in this line marks is take ad
        int x = 40;
//        change(marks);
        change();
        System.out.println("after changing "+ marks[0]);


    }
}
