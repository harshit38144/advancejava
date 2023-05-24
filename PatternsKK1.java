public class PatternsKK1 {
    public static void main(String[] args) {
        Pattern2(6);
    }
    static void Pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
