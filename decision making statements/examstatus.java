import java.util.Scanner;
public class examstatus{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your assesment status ?");
        String examsatatus=scanner.nextLine();
        //String examsatatus="pass";
        if(examsatatus=="pass"){
            System.out.println("Please wait for further status");
            String round1status="pass";
            if(round1status=="pass"){
                System.out.println("You passed round1 and wait for round2");
            }else{
                System.out.println("You can go home");
            }
        }else{
            System.out.println("You can go to the home");
        }
    }
}