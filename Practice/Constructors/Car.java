//Parametrized constructor
public class Car{
    String modelname;
    int modelyear;
    Car(int year,String name){
        modelyear = year;
        modelname = name;
    }
    public static void main(String[] args){
        Car car = new Car(2025,"Toyota");
        System.out.println(car.modelname);
        System.out.println(car.modelyear);
    }
}