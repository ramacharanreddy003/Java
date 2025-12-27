import java.util.Stack;
public class Stack_practice{
   public static void main(String[] args){
    Stack<Integer> s = new Stack<>();
    s.add(21);
    s.add(22);
    s.add(90);
    s.add(56);
    s.add(34);
    s.add(32);
    System.out.println(s);
    System.out.println(s.get(2));
    
    s.remove(0);
    System.out.println(s);

    System.out.println(s.contains(22));
    System.out.println(s.contains(91));

    s.set(1,344);
    System.out.println(s);


    s.push(455);
    System.out.println(s);

    s.pop();
    System.out.println(s);
    System.out.println(s.pop());
    System.out.println(s);

    System.out.println(s);
    System.out.println(s.peek());

    System.out.println(s.isEmpty());
    System.out.println(s.empty());

    









   }   
}
