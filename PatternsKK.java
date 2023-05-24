public class PatternsKK {
    public static void main(String[] args) {
        Pattern(3);
    }
    static void Pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
