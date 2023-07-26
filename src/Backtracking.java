public class backtracking {
    public static void printPermutation(String x, int idx, String perm){
        if (x.length()== 0){
            System.out.println(perm);
            return;
        }
        //tracking the path we came from to get the solution if it's not the desired one
        for (int i = 0; i<x.length(); i++){
            char currChar = x.charAt(i);
            String newStr = x.substring(0,i) + x.substring(i+1);
            printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static void main(String[] args) {
              String x = "abc";
              printPermutation(x, 0, "");
    }
}
