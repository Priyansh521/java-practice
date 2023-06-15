import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class anagram_ {

    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        s1= sc.next();
        s2 = sc.next();
        System.out.println(" The words are: " + s1 + " and "+ s2);
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length()==s2.length()) {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            boolean isEqual = Arrays.equals(s1Array, s2Array);
            if (isEqual){
                System.out.println(s1+  " and " + s2 + " are anagram");
            }else {
                System.out.println(s1 +" and "+ s2+" are not anagram");
            }
        }
    }
}
