public class Employee{
    String name;
    double salary;
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.name="Charan";
        emp.salary=15000.0;
        emp.displayDetails();

    }
}