public class Q1 {
    public static void linearSearch(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                break;
            }
        }
    }

    public static void binary(int [] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                break;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

    }
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6,7,8,9,10};
//        int target = 9;
        int[] sizes = {100 ,1000,100000};
        for(int i : sizes){
            System.out.println();
            System.out.println("Time taken for Size " + i );
            int[] arr = new int[i];
            for(int j=0;j<i;j++){
                arr[j] = j+1;
            }
            int target = i-1;

            long startTime = System.nanoTime();
            linearSearch(arr,target);
            long endTime = System.nanoTime();
            System.out.println("Time taken: "+(endTime-startTime));

            startTime = System.nanoTime();
            binary(arr,target);
            endTime = System.nanoTime();
            System.out.println("Time taken: "+(endTime-startTime));

        }

    }
}
