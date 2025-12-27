public class Student_data{
    private int roll_number;
    private String name;
    private boolean isAttend;
    public Student_data(int roll_number){   //constructor
        this.roll_number=roll_number;

    }
    public void setStudentAttendence(boolean flag){
        if(!isAttend)
            isAttend=flag;
        System.out.println("Teacher assigned attendence to student");
    }
    public boolean getStudentAttendence(){
        System.out.println("Teacher accessed student attendence");
        return isAttend;
    }
}