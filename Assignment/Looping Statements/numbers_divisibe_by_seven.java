import java.util.Scanner;
public class numbers_divisibe_by_seven{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number ");
        int starting_number = scanner.nextInt();

        System.out.println("Enter the ending number ");
        int ending_number = scanner.nextInt();
        int number = starting_number;

        while(number<=ending_number){
            if(number%7==0){
                System.out.println(number);
            }
            number++;
        }
        scanner.close();

    }
}