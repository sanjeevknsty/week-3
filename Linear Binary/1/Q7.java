import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) {
        try{
            FileInputStream  fis = new FileInputStream("sample.txt");
            InputStreamReader  isr = new InputStreamReader(fis,"UTF-8");

//            String str = isr.toString();
            BufferedReader br = new BufferedReader(isr       );

            System.out.println(br);
            String line;
            while ((line = br.readLine() ) != null){
                System.out.println(line);
            }
            br.close();
            isr.close();
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
