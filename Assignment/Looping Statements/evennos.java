import java.util.Scanner;
public class evennos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int startingnumber = scanner.nextInt();

        System.out.println("Enter the ending number: ");
        int endingnumber = scanner.nextInt(); 
        
        int number = startingnumber;
        while(number<=endingnumber){
            if(number%2==0){
                System.out.println(number);
            
            }
            number++;
        }
        scanner.close();

    } 
}