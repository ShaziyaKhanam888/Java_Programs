import java.util.*;
public class swap {
    public static void main(String args[]) {
        //reverse 3 digit no.
        int num,n,temp=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num>0) {
            n=num%10;
            temp=(num*temp)+temp;
            num=num/10;
      }
      if(temp==num) {
        System.out.println(num);
      }

        }
    
}
