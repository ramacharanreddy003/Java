public class Student{
    public int rollno=45;

    public Student(){
        rollno=343;
    }

   public void printrollnumber(){
    System.out.println(rollno);
   }
    public static void main(String[] args){
        Student s = new Student();

    }
    public void abc(){
        printrollnumber();
    }
}