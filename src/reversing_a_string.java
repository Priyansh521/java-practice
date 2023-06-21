import java.util.Scanner;

public class reversing_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder rev = new StringBuilder(sc.next());
        for (int i = rev.length()/2 ; i>=0;i--){
           int front = i;
           int back = rev.length()-1-i;
           char frontChar = rev.charAt(front);
           char backChar = rev.charAt(back);
           rev.setCharAt(front, backChar);
           rev.setCharAt(back, frontChar);
        }
        System.out.println(rev);
    }
}
