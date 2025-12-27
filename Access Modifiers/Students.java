public class Students{
    int rollnumber;
    String name;
    boolean isAttend;
    public Students(int rollnumber){
        this.rollnumber = rollnumber;
    }

    public void setStudentAtendence(boolean flag){
        if(!isAttend)
            isAttended=flag;
        System.out.println("Assigned attemndence");
    }
    public boolean getStudentAttendence(){
        System.out.println("teacher accessed student attendence");
        return isAttend;
    }
}