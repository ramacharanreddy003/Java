import java.io.Serializable;
public class Student implements Serializable{
    private int id;
    private String name;
    private double marks;
    
    public Student(){

    }

    public Student(int id,String name){

    }
     public int getID(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
   
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }


}