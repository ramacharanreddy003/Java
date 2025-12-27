public class Program2{
    public static void main(String[] args){
        Student stu1 = new Student();
        
        stu1.setId(101);
        stu1.setName("Ram");
        stu1.setMarks(78);


        System.out.println(stu1.getID()); 
        System.out.println(stu1.getName());
        System.out.println(stu1.getMarks());
    }
}