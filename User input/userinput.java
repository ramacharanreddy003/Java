import java.util.Scanner;
public class userinput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.printf("Hello! %s, How are you? ",name);
        String status=sc.nextLine();

        System.out.println("What is your age ?");
        int age=sc.nextInt();
        System.out.printf("Your name is %s \n",name);
        System.out.printf("Your age is %d\n",age);
        System.out.println("Thank you!");



    }
}