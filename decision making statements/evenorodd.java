import java.util.Scanner;
public class evenorodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd: ");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is Odd");
        }
        sc.close();
    }
}