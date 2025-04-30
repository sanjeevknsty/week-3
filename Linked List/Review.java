import java.util.Arrays;

//
//class A{
//    public void displayA(){
//        System.out.println("This is A");
//    }
//}
//
//class B extends  A{
//    public void displayB(){
//        System.out.println("This is B");
//    }
//}
//
//class C extends B{
//    public void displayC(){
//        System.out.println("This is C");
//    }
//
//}
//
//
//public class Review {
//    public static void main(String[] args) {
//        C cObj = new C();
//        cObj.displayC();
//        cObj.displayB();
//        cObj.displayA();
//    }
//}
//public class Review{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,3,5};
//        int n = arr.length;
//        int mat[][] =  new int[n][2];
//
//        for(int i =0 ; i< n;i++){
//            int count = 0;
//            for(int j =0 ; j< n;j++){
//
//
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//                mat[i][0] = arr[i];
//                mat[i][1] = count;
//
//        }
//        for(int i =0 ; i< n;i++){
//            System.out.println(mat[i][0] + " " + mat[i][1]);
//        }
//
//        int[] arr1= new int[n];
//
//        for(int i =0 ;i <  n;i++){
//            if(mat[i][1] <=1){
//                arr1[i] = mat[i][0];
//            }
//            else{
//                for(int j =0 ; j< i; j++){
//                    if(mat[i][0] == mat[j][0]){
//                        arr1[i] = mat[i][0];
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//
//    }
//}

//public class Review{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,3,5,3};
//        int n = arr.length;
//        int mat[]=  new int[n];
//
//        int count = 0;
//        for(int i =0 ; i< n;i++){
//            int count2 = 0;
//            for(int j =0 ; j< n;j++){
//
//                if(arr[i] == arr[j]){
//                    count2++;
//                }
//            }
//            if(count2 <=1){
//                mat[count] = arr[i];
//                count++;
//            }
//
//        }
//        for(int i =0 ; i< count;i++){
//            System.out.println(mat[i] );
//        }
//    }
//}

public class Review{
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7,9};
        int [] arr2 = {2,4,6,8,10,12,13};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];

        int i = 0;
        int j = 0;
        int index = 0;
        while(i <  n1 && j < n2){
            arr3[index++] = arr1[i];
            arr3[index++] = arr2[j];
           i++;
           j++;
        }

        if(i < n1){
            while(i < n1){
                arr3[index++] = arr1[i];
                i++;
            }
        }
        if(j < n2){ 
            while(j < n2){
                arr3[index++] = arr2[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(arr3));
    }
}