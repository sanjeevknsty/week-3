public class Q5 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};
        int target = 12;
        int left =0 ;
        int right = (4*4)-1;
        while(left <= right){
            int mid = (left + right) /2;
            int row = (mid/4) ;
            int col = (mid % 4);
            System.out.println(row +" " +  col + " " + mid);
            System.out.println("NUm " + matrix[row][col]);

            if(matrix[row][col] == target){
                System.out.println("Target Found " + row + " " + col + " " + matrix[row][col]);
                break;
            }else if(target < matrix[row][col]) {
                right = mid-1;
            }
            else {
                left = mid +1;
            }
            System.out.println(left + " <-Left And Right -> " + right);

        }
    }
}
