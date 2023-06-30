public class rotating_string {
    public static void printArray(int array[]){
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]+ ", ");
        }
    }
    public static void main(String[] args) {
        int d =2 ;
        int[] array = {1,2,3,4,5};
        int n = array.length;
        while (d>0){
            for (int i = 0; i<n-1;i++){
                int temp = array[i];
                array[i]= array[i+1];
                array[i+1] = temp;
            }
            d--;
        }
        printArray(array);
    }
}
