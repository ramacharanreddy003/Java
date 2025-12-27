public class Employee{

    private int id;
    public String name;
    private double salary;

    public Employee(){
        System.out.println("No args constructor is called.");
    }
   /* public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }*/
    public void setID(int id){
        this.id=id;

    }
      public int getID(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }

}