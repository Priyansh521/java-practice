public class Insertion_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1,4,6,2,4};
        //insertion sort
        for (int i = 0; i< array.length; i++){
            int current = array[i];
            int  j = i-1;
            while (j>=0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        printArray(array);
    }
}
