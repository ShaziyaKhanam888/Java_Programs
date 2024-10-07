import java.util.*;
public class average {
    //Average of 3 no.s using function
   public static int printAverage(int a,int b,int c) {
       return (a+b+c)/3;
   }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(printAverage(a,b,c));

    }
}
