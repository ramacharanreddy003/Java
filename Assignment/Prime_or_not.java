import java.util.Scanner;
public class Prime_or_not{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=scanner.nextInt();
        boolean isPrime=true;
        if(number !=1 || number !=2){
            int i=2;
            while(i<number){
                if(number%i==0){
                    isPrime=true;
                    break;
                }
                i++;
            }
        }
        else
        isPrime = false;
            if(isPrime){
                System.out.println("Given number is a prime number");
            }else{
                System.out.println("Given number is not a prime number");
            }
        scanner.close();
    }
}