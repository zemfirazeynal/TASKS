package self;

public class MinValue {
    public static void main(String[] args) {
        int[][] b = new int[3][2];

        b[0][0]=-6;
        b[0][1]=23;
        b[1][0]=-10;
        b[1][1]=24;
        b[2][0]=-19;
        b[2][1]=-26;


        int min = Integer.MAX_VALUE;

        for (int i = 0; i<b.length; i++){
            for(int j = 0; j<b[i].length; j++){
               if (b[i][j]<min){
                   min = b[i][j];
               }
            }
        }
        System.out.println(min);
    }
}
