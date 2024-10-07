import java.util.*;
public class marks { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks = sc.nextInt();
        for(int i=0;;i++) {
            if(n==1) {
                if(marks>=90) {
                    System.out.println("This is Good");
                } else if(marks>=60 && marks>=89) {
                    System.out.println("This is also Good");
                } 
            }
            if(n==0) {
                break;
            }

        }
    }
    
}
