import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        String filep = "C:\\Users\\ksanj\\Training\\Linear Binary\\1\\sample.txt";

        try {
        BufferedReader br = new BufferedReader(new FileReader(filep));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
