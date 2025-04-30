public class Q6 {
    public static boolean Binary(int[]arr,int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = (left + right)/ 2;
            if(arr[mid] == target){
                return true;
            }else if(target > arr[mid]){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int target = 7;
        boolean found = Binary(arr,target);
        if(found){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
