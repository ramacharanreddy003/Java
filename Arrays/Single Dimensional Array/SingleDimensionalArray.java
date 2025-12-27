public class SingleDimensionalArray{
    public static void main(String[] args){
        int a[];
        int[] j = new int[5];
        j[0] = 5;
        j[1] = 6;
        j[2] = 7;
        j[3] = 21;
        //System.out.println(j[2]);
        //System.out.println(j[0]);

       /*  for(int i=0;i<j.length;i++){
            System.out.println(j[i]);

         }

        int sum=j[0]+j[1]+j[2]+j[3];
        System.out.println(sum);        */

        int i=0;
        while(i<j.length){
            System.out.println(j[i]);
            i++;
        }
    // String[] cars={"Tata","Toyota","Morris Garages","Ford"};
    // System.out.println(cars[0]);
   

    }
}