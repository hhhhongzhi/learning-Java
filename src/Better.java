public class Better {
    public static void main(String[] args) {
        int[][] ns = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12}};
        for(int[]arr:ns){
            for(int n:arr){
                System.out.println(n);
                System.out.println(',');
            }System.out.println();
        }

    }
}