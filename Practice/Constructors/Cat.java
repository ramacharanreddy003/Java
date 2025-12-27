//no args constructor
public class Cat{
    String name;
    String color;

    Cat(){
        name="Cat";
        color="White";

    }
    public static void main(String[] args){
        Cat c = new Cat();
        System.out.println("Name: "+c.name);
        System.out.println("Color: "+c.color);
    }
}