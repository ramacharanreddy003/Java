public class Simple_interest{
    public static void main(String[] args){
        int principal = 1000;
        int rate = 2;
        int time=4;
        int interest = (principal*rate*time)/100;
        int total_amount=principal+interest;
        System.out.println("Interest is: "+ interest);
        System.out.println("Total amount after "+time+" years is: "+total_amount);
    }
}