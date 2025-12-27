public class TwoDimensionalArray{
    public static void main(String[] args){
        int[][] array = new int[3][2];
        array[0] = new int[4];
        array[1] = new int[5];
        array[2] = new int[6];

        array[0][0] = 10;
        array[0][1] = 9;
        array[0][2] = 31;
        array[0][3] = 12;

        array[1][0] = 61;
        array[1][1] = 99;
        array[1][2] = 78;
        array[1][3] = 34;
        array[1][4] = 674;

        array[2][0] = 4;
        array[2][1] = 11;
        array[2][2] = 13;
        array[2][3] = 41;
        array[2][4] = 16;
 

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}