import java.util.Scanner;

public class greatest_number {
    public static void greatestOfTwoNumber(int a, int b){
              if (a>b){
                  System.out.println(a);
              }else{
                  System.out.println(b);
              }
    }
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);
        int a = scs.nextInt();
        int b = scs.nextInt();
        greatestOfTwoNumber(a, b);
    }
}
