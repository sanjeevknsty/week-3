public class Q3 {
    public static void main(String[] args) {

        int arr[] = {13,14,1,2,3,6,8,12};
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int mid  = (i + j )/ 2;
            if(arr[mid]> arr[j]){
                i = mid+1;
            } else if (arr[mid] < arr[j]) {
             j = mid;
            }
//            if(i==j){
//                System.out.println(arr[j]);
//                break;
//            }
        }
                System.out.println(arr[j]);

    }
}
