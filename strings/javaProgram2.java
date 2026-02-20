package strings;
 class JavaProgram2 {
     public static int findMax(int[] arr, int n) {
         if (n == 1) {  // Base case: only one element
             return arr[0];
         }

         // Recursively find the maximum of first n-1 elements
         int max = findMax(arr, n - 1);

         // Compare last element with maximum of rest
         if (arr[n - 1] > max) {
             return arr[n - 1];
         } else {
             return max;
         }
     }
    public static void main(String[] args) {

//        for (int i = 1; i <= 6; i++) {  // Rows
//            for (int j = 1; j <= i; j++) {
//
//                if (j == 1 || j == i) {
//                    System.out.print("1");
//                } else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//        int a = 121;
//        int temp =a;
//        int last;
//        int tmp=0;
//        while(a>0){
//            last = a%10;
//            tmp = tmp * 10 + last;
////            tmp *= 10 + last;
//            a /= 10;
//        }
//        if(temp == tmp) {
//
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }

        int[] array = {5, 12, 7, 20, 3};
        int maxValue = findMax(array, array.length);
        System.out.println("Maximum value in the array is: " + maxValue);
    }
}
