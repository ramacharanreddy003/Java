public class Program1{
    public static void main(String[] args){
        method1();


    }
        public static void method1(){
        System.out.println("Program execution start");
        int fnum=9;
        int snum=0;
        int result=0;

        
        //File file = new File("C:\Users\ckram\OneDrive\Desktop\RESUME CHARAN\CHARAN RESUME ORIGINAL\Rama Charan Reddy Resume.pdf");
       // FileInputStream fis = new FileInputStream(file);
       // System.out.println(fis);
        try{
            result=fnum/snum;
        }
        catch(ArithmeticException ae){
            //System.out.println(ae.toString());
            //System.out.println(ae.getMessage());//it writes only exception message
           // System.out.println(Arrays.toString(ae.getStackTrace()));
           ae.printStackTrace();
            
        }
        finally{
            System.out.println("Finally block");
        }
        System.out.println("output is: "+result);

        System.out.println("Execution end");
    }
}