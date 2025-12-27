public class Test{
    int i;
    int j;
    public Test(){
        i=12;
        j=99;

    }
    public Test(int i,int j){
        this.i=i;
        this.j=j;

    }
    public static void main(String[] args){
        Test t1 = new Test();       //obj
        Test t2 = new Test(3,4);
        Test t3 = new Test(43,87);
        //System.out.println(t1.hashCode());
        //System.out.println(t2.hashCode());
        //System.out.println(t3.hashCode());

        //System.out.println(t1.add());
        System.out.println(t2.add());
        //System.out.println(t3.add());
        System.out.println(t3.i);
        System.out.println(t3.j);

        System.out.println(t1==t2);



    }
    public int add(){
        return i+j;
    }
}