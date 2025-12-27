import java.util.Scanner;
public class ArithmeticOperationsPractice{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a first number");//It takes input from the user as a first number.
        int n1=scanner.nextInt();
        System.out.println("Enter a second number");
        int n2=scanner.nextInt();
        System.out.println("Enter the operation: ");
        String operator=scanner.next();
        int result=0;
        /**
         *
         */
        switch(operator){           /*Performing operations 
                                    like Addition, Subtraction, 
                                    Multiplication, Modulus 
                                    and division oprations  */
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
    
      
        