import java.util.Scanner;
public class evenorodd{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();
        int remainder=number%2;
        switch(remainder){
            case 0:
                System.out.println("Given number is even");
                break;
            case 1:
                System.out.println("Given number is odd");
                break;

        }
        scanner.close();

    }
}