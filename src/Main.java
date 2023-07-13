import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Char array to string
        char[] ch = {'J','a','v','a'};
        String s = new String(ch);
        System.out.println(ch);

        //Same as
        String str = "Java String";
        System.out.println(str);

        String p = "Hello";
        String q = "World";
        System.out.println(p+q);

        String a = "Hello";
        System.out.println("Hello".equals(a));
        System.out.println("hello".equals(a));
        System.out.println("hello".equalsIgnoreCase(a));

        String text = "EFAC GALLE RUHUNA";
        System.out.println(text.length());
        System.out.println(text.substring(5));
        System.out.println(text.substring(5,10));
        System.out.println(text.indexOf('C'));
        System.out.println(text.lastIndexOf('U'));
        System.out.println(text.charAt(5));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.startsWith("NSBM"));
        System.out.println(text.contains("GALLE"));

        StringBuilder sb = new StringBuilder("NIBM");
        sb.append(" ").append("Galle").append(" Branch");
        System.out.println(sb.toString());
        sb.delete(5,10);
        System.out.println(sb.toString());
        sb.insert(5,"Matara");
        System.out.println(sb.toString());
        System.out.println(sb.substring(5));
        System.out.println(sb.substring(5,11));

        
    }
}