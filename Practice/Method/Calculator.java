import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1=scanner.nextDouble();

        System.out.println("Enter the operator:");
        char operator=scanner.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2=scanner.nextDouble();

        double result=calculate(num1,operator,num2);
        System.out.println("Result: "+result);
    }
    public static double calculate(double num1,char operator,double num2){
            switch(operator){
                case '+':
                    return add(num1,num2);
                case '-':
                    return subtract(num1,num2);
                case '*':
                    return multiply(num1,num2);
                case '/':
                    return divide(num1,num2);
                default:
                    System.out.println("Invalid operator");
                    return 0;
                
            }
        }
        public static double add(double num1,double num2){
            return num1+num2;
        }
        public static double subtract(double num1,double num2){
            return num1-num2;
        }
        public static double multiply(double num1,double num2){
            return num1*num2;
        }
        public static double divide(double num1,double num2){
            if(num2!=0){
                return num1/num2;
            }else{
                System.out.println("Cannot divide by Zero");
                return 0;
            }
           
        }
}