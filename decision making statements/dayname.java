import java.util.Scanner;
public class dayname{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day name: ");
        String dayName=sc.nextLine();
        if(dayName.equals("Monday")||
        dayName.equals("Tuesday")||
        dayName.equals("Wednesday")||
        dayName.equals("Thusday")||
        dayName.equals("Friday"))
        System.out.println("It's a weekday.");
        else if(dayName.equals("Saturday")||
        dayName.equals("Sunday"))
        System.out.println("It's a weekend");



        sc.close();
    }
}