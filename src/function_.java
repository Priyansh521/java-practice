import java.util.Scanner;

public class function_ {
    public static void threeNumbers(float a, float b, float c){
        float  sum = a+b+c;
        float average = sum/3;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        threeNumbers(a, b, c);
    }
}
