import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String arr[] = {"The moon whispered secrets only the tide could understand.",
                "A paper airplane carried dreams beyond the tallest mountains.",
                "She danced like the wind was her favorite melody.",
                "Shadows stretched like sleepy giants at sunset.",
                "Somewhere, a cat is plotting world domination."};
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i].contains("the")){
                System.out.println(arr[i]);
            }else {
                System.out.println("Not Found");
            }
        }




    }
}
