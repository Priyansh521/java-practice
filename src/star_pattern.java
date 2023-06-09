public class star_pattern {
    public static void main(String[] args) {
        int a=4, b =5;
        int i, j;
        for(i = 1; i<=a ; i++){
                for( j = 1 ; j<=b ; j++){
                    if ( i ==1|| j ==1 || i==a ||j==b) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
        }
    }
}
