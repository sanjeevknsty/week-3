import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args) {
        try{

            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            int count = 0;
            String target = "rohit";
            String line;
            while ((line = br.readLine()) != null){

                if (line.toLowerCase().contains(target)){
                    count++;
                }
            }
            System.out.println(count);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
