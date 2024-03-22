package self;

public class MaxValue {
    public static void main(String[] args) {
        int [][] a = new int [2][3];

        a[0][0] = 11;
        a[0][1] = 56;
        a[0][2] = -23;
        a[1][0] = 98;
        a[1][1] = 14;
        a[1][2] = -56;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i< a.length; i++){
            for (int j =0; j<a[i].length; j++){
                if (a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
