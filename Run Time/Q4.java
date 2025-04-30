import java.io.*;
public class Q4{
    public static void fileReader(String fileName) {
        try(FileReader fr = new FileReader(fileName)){
            int ch;
            while ((ch = fr.read()) != -1) {
            }
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void inputStreamReader(String fileName) {
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName))){
            int ch;
            while ((ch = isr.read()) != -1) {
            }
            isr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "sample.txt";
        System.out.println();
        long startTime = System.currentTimeMillis();
        fileReader(fileName);
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        inputStreamReader(fileName);
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");

    }
}
