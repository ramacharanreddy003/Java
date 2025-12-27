public class JaggedArrayExample{
    public static void main(String[] args){
        int[][] array = new int [3][];
        
        array[0] = new int[3];
        array[1] = new int[5];
        array[2] = new int[4];

        array[0][0] = 1;
        array[0][1] = 12;
        array[0][2] = 41;

        
        array[1][0] = 34;
        array[1][1] = 13;
        array[1][2] = 23;
        array[1][3] = 56;
        array[1][4] = 98;

        array[2][0] = 4;
        array[2][1] = 7;
        array[2][2] = 3;
        array[2][3] = 5;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }       
    }
}
