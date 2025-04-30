//Insertion sort
import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the no of employees: ");
        int num=inp.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            System.out.print(" employee " +(i+1)+ " : ");
            arr[i]=inp.nextInt();
        }

        for(int i=1;i<num;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        System.out.print("After sorting ");
        for (int ids:arr){
            System.out.print(ids+" ");
        }
    }
}