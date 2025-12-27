import java.util.Scanner;
public class Values{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting_number ");
        int starting_number = scanner.nextInt();

        System.out.println("Please enter the ending_number ");
        int ending_number = scanner.nextInt();

        for(int i=starting_number;i<=ending_number;i++){
            System.out.println(i);
        }

        scanner.close();
    }
}