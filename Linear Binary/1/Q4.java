import java.util.Timer;

public class Q4 {
    public static void main(String[] args) {
        long startTime,endTime;
        StringBuffer strBuffer = new StringBuffer();
        StringBuilder strBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for(int i =0 ; i< 10000;i++){
            strBuilder.append("Hello ");
        }
        endTime = System.nanoTime();
        System.out.println("String Builder Time " + (endTime - startTime));

        startTime = System.nanoTime();
        for(int i =0 ; i< 10000;i++){
            strBuffer.append("Hello ");
        }
        endTime = System.nanoTime();
        System.out.println("String Buffer Time " + (endTime - startTime ));



    }
}
