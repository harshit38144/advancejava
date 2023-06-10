import java.util.Scanner;

public class kk17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        for (int r = 1; r<2* n; r++) {
            int space=r<=n?n-r:r-n;
            for (int s = 0; s <=space ; s++) {
                System.out.print("  ");
            }
            if(r<=n) {
                for (int c = r; c >= 1; c--) {
                    System.out.print(c + " ");
                }
                for(int c=2;c<=r;c++)
                    System.out.print(c+" ");
            }else {
                for (int c=2*n-r;c>1;c--)
                    System.out.print(c+" ");
                for(int c=1;c<=2*n-r;c++ )
                    System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
