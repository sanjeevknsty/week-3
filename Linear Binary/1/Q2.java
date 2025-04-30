import java.util.HashSet;

public class Q2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String line = "Helloo   worddddd";
        HashSet<Character> set = new HashSet<>();
        for(int i =0 ;i < line.length() ; i++){
            char k = line.charAt(i);
            set.add(k);
        }

        for(int i =0 ;i < line.length() ; i++){
            char k = line.charAt(i);
            if(!set.contains(k)){
                sb.append(k);
            }
        }
        System.out.println(set);
        System.out.println(sb);
    }
}
