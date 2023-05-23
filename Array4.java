public class Array4 {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        arr[0][0]=11;
        arr[0][1]=22;
        arr[0][2]=33;
        arr[0][3]=44;
        arr[1][0]=55;
        arr[1][1]=66;
        arr[1][2]=77;
        arr[1][3]=88;
        arr[2][0]=99;
        arr[2][1]=88;
        arr[2][2]=77;
        arr[2][3]=66;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
