import java.util.*;
public class input {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
    int b = sc.nextInt();
    
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a/b);
    System.out.println(a%b);
    String name = sc.nextLine(); 
    String institute = sc.nextLine();
    System.out.println("your name is:"+name);
    System.out.println("your college name is:"+institute);
    }
    
}
