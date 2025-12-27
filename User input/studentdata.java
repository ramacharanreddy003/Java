import java.util.Scanner;
public class studentdata{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();
       
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();

        System.out.println("Hey "+name+ "!");
        System.out.println("Your age is "+age);
        System.out.println("Thank you for the info.");
        scanner.close();
    }
}