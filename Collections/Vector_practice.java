import java.util.Vector;
public class Vector_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v1 = new Vector<>();
		v1.add("Charan");
		v1.add("Ram");
		v1.add("Shyam");
		
		v1.add("Loki");
        v1.add("Vijay");
        v1.add("Pavan");
        v1.add("Venu");
		
		System.out.println(v1);

        
        System.out.println(v1.get(0));

        v1.remove("Shyam");
        System.out.println(v1);

        //v1.clear();
        //System.out.println(v1);
        System.out.println(v1.contains("Ram"));

        System.out.println(v1.set(1,"Ramu"));
        System.out.println(v1);

        v1.add("Ramu");
        System.out.println(v1);
        System.out.println(v1.indexOf("Ramu"));
        System.out.println(v1.lastIndexOf("Ramu"));


		

	}

	

	
	
}
