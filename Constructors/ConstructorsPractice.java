public class ConstructorsPractice{
    public int i;
    public static void main(String[] args){
        ConstructorsPractice cp = new ConstructorsPractice(43);
        ConstructorsPractice ab = new ConstructorsPractice(8787);
        System.out.println(cp.i);
        System.out.println(ab.i);
    }
    public ConstructorsPractice(){
    //    i=23;           //explict parameter less constructor
       
    }
    public ConstructorsPractice(int a){
        i=a;
    }
}