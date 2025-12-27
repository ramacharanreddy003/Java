public class loops{
    public static  void main(String[] args){
        //int[] arr={12,3,4,53,5,7,3,5,87,6};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // int sum=0;
        // for(int value:arr){
        //     sum+=value;
        //     //System.out.println(value);
        // }
        // System.out.println(sum/arr.length);
    int[][] arr = {
        {1,3,4},
        {5,4,7},
        {9,7,6}
    };
    int sum=0;
    for(int[] SingleDimensionalArray:arr)
    for(int value:SingleDimensionalArray){
        System.out.println(value);
    }
    System.out.println();

    }
}




