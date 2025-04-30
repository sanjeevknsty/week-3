public class Q4 {
    public static void main(String[] args) {
        int[]arr = {1, 3, 20, 4, 1, 0};
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if( arr[mid] > arr[mid -1] && arr[mid] > arr[mid+1]) {
                System.out.println(arr[mid]);
                break;

            }
            if (arr[mid] < arr[mid-1]) {
                right = mid-1;
            } else if (arr[mid] < arr[mid +1]) {
                left = mid+1;
            }

        }
    }
}
