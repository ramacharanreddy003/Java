public class Test{
    int i;
    int j;

    Test(){
      i=37;
      j=50;  
    }
    Test(int i,int j){
        this.i=i;
        this.j=j;
    }
    int add(){
        return i+j;
    }
    int sub(){ 
        return i-j;
    }
    public static void main(String[] args){

        Test t1 = new Test();

        Test t2 = new Test(25,6);

        System.out.println(t1.i);
        System.out.println(t1.add());
        System.out.println(t2.add());
        System.out.println(t1.sub());
        System.out.println(t2.sub());   
    }
} 