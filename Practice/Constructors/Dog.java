//parametrized constructor
public class Dog{

    String name;
    String color;
    Dog(String n,String c){
        name=n;
        color=c;
    }
    public static void main(String[] args){
        Dog dog = new Dog("Tom","Black");
        System.out.println("Dog name: "+dog.name);
        System.out.println("Dog color: "+dog.color);
    }
}