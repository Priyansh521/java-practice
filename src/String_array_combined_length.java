import java.util.*;

public class string_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int length = 0;
        String array[] = new String[size];
        for (int i = 0; i<size; i++){
            array[i] = sc.next();
            int lengthOfElement = array[i]. length();
            length += lengthOfElement;
        }
        System.out.println(length);
    }
}
