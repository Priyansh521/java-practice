import java.util.Scanner;

public class replace_string {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Give an iput of string format");
        String original = sc.next();
        String result = "";
        for (int i = 0; i< original.length(); i++){
            if (original.charAt(i)== 'e'  ){
                result += 'i';
            }else {
                result += original.charAt(i);
            }
        }
        System.out.println(result);
    }
}
