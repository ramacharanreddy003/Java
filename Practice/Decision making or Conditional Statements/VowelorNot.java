import java.util.Scanner;
public class VowelorNot{
    public static void main(String[] args){
        //char ch='a';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character(A to Z or a to z): ");
        char ch=sc.next().charAt(0);
        switch(ch){
           // case 1:
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Given string is Vowel.");
                break;
            default:
                System.out.println("Given character is not a Vowel it's a Consonant.");
                break;
            

        }
    }
}