package strings;

public class vinay_26_27_array {
    static void main() {
        int i=0;
//1. first method to initialize value and create array
        int [] marks = new int[5];
               marks[0] = 101;
               marks[1] = 100;
               marks[2] = 200;
               marks[3] = 300;
               marks[4] = 400;
//        for(int i=0;i< marks.length;i++){
//
//        System.out.println(marks[i]);
//        }
//        while(i< marks.length){
//            System.out.println(marks[i]);
//            i++;
//        }
//        System.out.println(marks[3]);
        int [] arr = {1,2,3,4,5,6,7,8};
//        while(i< arr.length){
//            System.out.println(arr[i]);
//            i++;
//        }
//        vinay_27_array_with_foreach
        for(int ele : arr)
        {
            System.out.println(ele);
        }

        for(int ele : marks)
        {
            System.out.println(ele);
        }
    }

}
