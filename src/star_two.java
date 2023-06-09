public class star_two {
    public static void main(String[] args) {
        int b= 5, row = 4;
        for (int i = 0; i<= row; i++){
            // for pyramid type shape put i instead b in the next for loop
            for (int j = 0; j<= b ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
