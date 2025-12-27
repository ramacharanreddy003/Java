public class Program1{
    public static void main(String[] args){

        Employee e1 = new Employee();
        e1.setID(537);
        e1.setName("Charan");
        e1.setSalary(5000.5);

        Employee e2 = new Employee();
        e2.setID(101);
        e2.setName("Janu");
        e2.setSalary(2000.00);

        Employee e3 = new Employee();
        e3.setID(102);
        e3.setName("Shyam");
        e3.setSalary(6000);

        //Employee[] employees = new Employee[] {e2,e3};
        //System.out.println(employees);

        System.out.println(e1.getID());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());


}
}