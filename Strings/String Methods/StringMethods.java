import java.util.Arrays;
public class StringMethods{
    public static void main(String[] args){
        String s1="Hello";
        String s2="hello";
        String s3="HELLO";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.contains("e"));
        System.out.println(s1.contains("m"));

        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.equals(s2));

        System.out.println(s1.length());

        String c=" Cat is eating ";
        System.out.println(c.length());
        System.out.println(c.trim().length());

        System.out.println(c.toLowerCase());
        System.out.println(c.toUpperCase());
        System.out.println(c.toCharArray());

        String p= "I am a boy";
        char[] f = p.toCharArray();
        System.out.println(f);

        String c1="JAVA";
        String lower_case=c1.toLowerCase();
        System.out.println(lower_case);

        String v="java";
        String to_upper_case=v.toUpperCase();
        System.out.println(to_upper_case);

        String m="Apple is a fruit and is red in color";
        System.out.println(m.indexOf("l"));
        System.out.println(m.lastIndexOf("p"));
        System.out.println(m.substring(6));
        System.out.println(m.substring(11,16));

        System.out.println(Arrays.toString(m.split(" ")));

        System.out.println(m.charAt(4));

        System.out.println(m.replace("Apple","apple"));

        String ab="JAva";
        System.out.println(ab.replace("A","a"));

        String ab1="123";
        int i=Integer.valueOf(ab1);
        System.out.println(i);
        
        int j=345;
        String j1=String.valueOf(j);
        System.out.println(j1);

        String m1;
        String m2="  ";
        String m4="";
        String m5=" ";
       // System.out.println(m1.length());
        System.out.println(m2.length());
        System.out.println(m4.isEmpty());
        System.out.println(m2.isEmpty());
        System.out.println(m2.isBlank());
        System.out.println(m5.isBlank());
        

    }
}