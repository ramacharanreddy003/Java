    import java.util.Scanner;
public class Odd_nos_rev_order{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number ");
        int starting_number = scanner.nextInt();

        System.out.println("Enter the ending number ");
        int ending_number = scanner.nextInt();
        int number = starting_number;
        int sum=0;
        while(number>=ending_number){
            if(number%2==1){
                System.out.println(number);
            }
            number--;

          
        }
        scanner.close();

    }
}