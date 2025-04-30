public class Q3{
    public static String string(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        return result;
    }
    public static String StringBuilder(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.toString();
    }
    public static String stringBuffer(int n) {
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            result.append("a");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int n : sizes) {
            System.out.println();
            System.out.println("array Size: " + n);
            long start = System.currentTimeMillis();
            if (n <= 10000) {
                string(n);
                long end = System.currentTimeMillis();
                System.out.println("String  Time: " + (end - start) + " ms");
            }
            start = System.currentTimeMillis();
            StringBuilder(n);
            long end = System.currentTimeMillis();
            System.out.println("StringBuilder  Time: " + (end - start) + " ms");

            start = System.currentTimeMillis();
            stringBuffer(n);
            end = System.currentTimeMillis();
            System.out.println("StringBuffer  Time: " + (end - start) + " ms");
        }
        }

}
