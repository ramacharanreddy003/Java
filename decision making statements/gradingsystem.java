import java.util.Scanner;
public class gradingsystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        int marks=sc.nextInt();
        if(marks<35){
            System.out.println("You failed.");
        }else if(marks>=35 && marks<=70){
            System.out.println("You passed in Third class.");
        }else if(marks>=85 && marks<=70){
            System.out.println("You passed in Secont class.");
        }else if(marks>=85 && marks<=100){
            System.out.println("You passed in First class"); 
        }else if(marks>100){
            System.out.println("Enter marks below 100 only.");
        }
        sc.close();
    }
}