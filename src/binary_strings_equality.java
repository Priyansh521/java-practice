import java.util.Arrays;
import java.util.Scanner;

public class binary_strings {
        public static void main(String[] args) {
        String str1 = "0110";
        String str2 = "0011";

        boolean canBeEqual = checkStrings(str1, str2);
        if (canBeEqual) System.out.println("The strings can be rearranged to be equal.");
        else
            System.out.println("The strings cannot be rearranged to be equal.");

    }      

        private static boolean checkStrings(String str1, String str2) {
         int count0sStr1 = 0;
         int count1sStr1 = 0;
         int count0sStr2 = 0;
         int count1sStr2 = 0;

          for (char ch : str1.toCharArray()) {
            if (ch == '0') {
                count0sStr1++;
            } else if (ch == '1') {
                count1sStr1++;
            }
        }

          for (char ch : str2.toCharArray()) {
            if (ch == '0') {
                count0sStr2++;
            } else if (ch == '1') {
                count1sStr2++;
            }
        }

          return count0sStr1 == count0sStr2 && count1sStr1 == count1sStr2;
    }

}
