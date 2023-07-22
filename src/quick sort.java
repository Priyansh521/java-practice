public class quick_sort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j<high; j++){
            if (arr[j]<pivot){
                i++;
                //swap the element smaller than the pivot to it's left side
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //creating space for the pivot point in the divided array
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;//pivot index
    }
    public static void quicky(int[] arr, int low, int high){
        //low<high is to check if we have more than 1 element in the array when we continue dividing it or after partition
        if (low<high){
            int piIdx = partition(arr, low, high);

            quicky(arr, low, piIdx-1);
            quicky(arr, high+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quicky(arr, 0, n-1);
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] +", ");
        }
    }
}
