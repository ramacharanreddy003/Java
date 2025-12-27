public interface Laptop{
    public void copy();

    public void paste();

    public void cut();

    public void keyboard();

    default void security(){
        
        System.out.println("Please implement");
    }

    static void audio(){
        commonCode();
        System.out.println("Laptop audio code");
    }
    static void commonCode(){
        System.out.println("Common code");
    }
    
}