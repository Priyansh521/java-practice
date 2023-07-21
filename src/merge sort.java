public class merge_sort {
    public static void conquer(int[] arr, int si, int mid, int ei){
        //creating new array to store the sorted element
        int[] merged = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        // this x variable will keep the count of the index of the merged array after filling an element
        int x = 0;
        while (idx1<=mid && idx2 <= ei){
            if (arr[idx1]<= arr[idx2]) {
                merged[x++] = arr[idx1++];
            }else merged[x++] = arr[idx2++];
        }
        //if by chance any element remain in divided array then it will be automatically added at the last index of merged array
        while (idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        //if by chance any element remain in divided array then it will be automatically added at the last index of merged array
        while (idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        //for copying the merged array into the original array
        for (int i = 0, j = si; i<merged.length; i++, j++ ){
            arr[j] = merged[i++];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if (si>=ei){
            return;
        }
        int mid = si+(ei=si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
         int[] arr = {6, 3, 9, 5, 2, 8};
         int n = arr.length;
         divide(arr, 0, n-1);
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}
