import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) {
        try{

        InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader  br = new BufferedReader(isr);
            System.out.println("ENter Line");
            String line = br.readLine();
            System.out.println(line);
            FileWriter fw = new FileWriter("write");
//            fw.append(line);
            fw.write(line);
            fw.close();
            br.close();
            isr.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
