// import java.util.Random;
// public class Test1{
//     public static void main(String[] args){
//        Test1 t1 = new Test1();
//        t1.print2();
//     }
// }
public class Test1{
    int number;
    static{
        System.out.println("static block");
    }
    {
        System.out.println("non- static block");
    }
    public Test1(){
        System.out.println("constructor");
        number=8;
    }
    public static void main(String[] args){
        System.out.println("main method");
        new Test1();
    }
}