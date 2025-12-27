import java.util.ArrayList;
public class Array_List{
    public static void main(String[] args){

        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(46);
        arr.add(0,89);
        arr.add(98);
        arr.add(76);

        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(2));

        System.out.println(arr.remove(2));

        System.out.println(arr);
       // arr.clear();
        arr.set(1,455); //updating
        System.out.println(arr);

        System.out.println(arr.indexOf(455));
        System.out.println(arr.indexOf(76));

        arr.add(76);
        System.out.println(arr);

        System.out.println(arr.lastIndexOf(76));
        








    }
}