import java.util.Scanner;
public class ArithmeticOperations{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a  first number");
        int n1=scanner.nextInt();
        System.out.println("Enter a  second number");
        int n2=scanner.nextInt();
        System.out.println("Enter the operation: ");
        String operator=scanner.next();
        int result=0;
        switch(operator){
            case "+":
                result=n1+n2;
                break;
            case "-":
                result=n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "%":
                result=n1%n2;
                break;
            case "/":
                result=n1/n2;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println(result);
        scanner.close();
    }
}
    
      
        