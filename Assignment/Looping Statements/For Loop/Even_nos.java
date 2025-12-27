import java.util.Scanner;
public class Even_nos{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int starting_number=scanner.nextInt();

        System.out.println("Enter the ending number: ");
        int ending_number = scanner.nextInt();

        for(int number=starting_number;number<=ending_number;number++){
            if(number%2==0){
                System.out.println(number);
            }
        }    
        
        scanner.close();
        
        
        
    }
}