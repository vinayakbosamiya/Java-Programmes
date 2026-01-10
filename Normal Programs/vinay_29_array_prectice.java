package strings;

public class vinay_29_array_prectice {
    static void main() {
        float [] m = {1.1f,2.3f,232.2f};

        float s =0;
        float num =222.3f;
        boolean isavailable =false;
// //       p1
//        for(float marks : m){
//           s += marks;
//        }
//        System.out.println(s);

//     //   p2
//        for (float n : m)
//        {
//            if(num == n)
//            {
//                isavailable = true;
//            }
//        }
//        if(isavailable){
//            System.out.println("the value is available !");
//        }
//        else{
//            System.out.println("value is not available !");
//        }
//  //          p3

//        int[][] mat1 = {{1,2,3},{4,5,6}};
//        int[][] mat2 = {{7,8,9},{10,11,12}};
//        int [][] res = {{0,0,0},{0,0,0}};
//        System.out.println("the value is " +mat2.length);
//        for(int i=0;i< mat1.length;i++) {
//            for(int j=0;j< mat1[i].length;j++) {
//                System.out.format("the value is i=%d and j=%d\n",i,j);
//                res[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        for(int i=0;i< mat1.length;i++) {
//            for(int j=0;j< mat1[i].length;j++) {
//                System.out.print(res[i][j]+" ");
//                res[i][j] = mat1[i][j] + mat2[i][j];
//
//            }
//            System.out.println("");
//        }

// //       p4 - reverse the array
//        int [] numbers = {-50,1,2,3,4,5,6,7,8,9,10,11}; // // // use this array with problem 4,5,6
//        int l = numbers.length; // // // use this array with problem 4,5,6
//        System.out.println(l);
//        int temp,n = Math.floorDiv(l,2); // // // use this array with problem 4,5,6
//        System.out.println(n);

//        for(int i=numbers.length;i > 0;i--){
//        for(i=0;i<numbers.length;i++){
//        for(int i=0;i<n;i++){
//            temp = numbers[i];//{11,10,9,8,7,6,5,4,3,2,1}
//            numbers[i] = numbers[l-i-1];
//            numbers[l-i-1] = temp;
//        }
//            for(int ele : numbers){
//                System.out.println(ele);
//            }


//            p5 - find maximum element

//        int max = numbers[0]; // // // use this array with problem 4,5,6
//        int max1 = 0;  // // // use this array with problem 4,5,6


//        for(int i=1;i<numbers.length;i++){
//            if (numbers[i]>max){
//                max = numbers[i];
//            }
//
//        }
//            System.out.println("using normal for loop : " + max);

//        for(int e:numbers){
//            if(e>max1){
//                max1=e;
//            }
//        }


//    p6 = find minimum value
//        for(int e:numbers){
//            if(e<max){
//                max=e;
//            }
//        }
//        System.out.println("using array for loop : " + max);


// // //        p7 = check array is shorted or not
        boolean issorted = true;
        int [] arr = {1,5,88,45,96,2,4};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                issorted = false;
                break;
            }
        }

        if(issorted){
            System.out.println("the array is sorted !");
        }

        else{
            System.out.println("the array is not sorted !");
        }
    }
}
