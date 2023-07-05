import java.util.Scanner;
public class leader {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int leader ;
            int[] array = new int[n];
            for (int i = 0; i<n; i++){
                array[i] =  sc.nextInt();
            }
            leader = array[n-1];
            System.out.println(leader);
            for (int i = n-1; i>0;i--){
                if (leader<array[i-1]){
                    leader = array[i-1];
                    System.out.print(leader +", ");
                }
            }
        }
    }
