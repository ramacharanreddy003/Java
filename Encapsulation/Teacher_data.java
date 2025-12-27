public class Teacher_data{
    public static void main(String[] args){
        Student_data s = new Student_data(101);
        //s.isAttend = true;
        s.setStudentAttendence(true);
        s.getStudentAttendence();
        //System.out.println("teacher assigned attendence to student");
    }
}