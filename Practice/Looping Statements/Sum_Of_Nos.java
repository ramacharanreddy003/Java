import java.util.Scanner;
public class Sum_Of_Nos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        int f=n*(n+1)/2;
        System.out.println(f);
        System.out.println(sum);
    }

}