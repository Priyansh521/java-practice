import java.util.Scanner;

public class count_it {
    public static void main(String[] args) {
        int positivecount = 0;
        int negativecount = 0;
        int zerocount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("use % to stop the input");
        while (true) {
            int number = sc.nextInt();
            if (number>0){
                positivecount++;
            }
            else if (number<0) {
                negativecount++;
            }
            else if(number == 0) {
                zerocount++;
            }
            break;
        }
        System.out.println("the positive count is: " + positivecount);
        System.out.println("the positive count is: " + negativecount);
        System.out.println("the positive count is: " + zerocount);
    }
        }

