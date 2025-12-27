public class Test {
    int i;
    int j;
    public Test(){
        i=12;
        j=13;
    }
    public Test(int i,int j){
        this.i=i;
        this.j=j;

    }
public static void main(String[] args){ 
      Test t1 = new Test(3,4);
      Test t2 = new Test(4,5);
      System.out.println(t1.i);
      System.out.println(t2.add());

    }
    public int add(){
        return i+j;
    }		
}
    