public class factorial{
    public static int calfact(int m){
        int factorial=1;
        for(int i=1;i<=m;i++){
            factorial *=i;
        }
    return factorial;
    }
    public static void main(String[] args){
        int result=calfact(5);
        System.out.println(result);
    }
}