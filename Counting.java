import java.util.*;
 public class Counting {
  /*Write a program to enter the numbers till the user wants and at the end it should display the count of 
   positive,negative and zeros */
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int positive = 0, negative = 0, zeros = 0;
    System.out.println("Press 11 to continue anf 00 to stop:");
    int input = sc.nextInt();
    //  if(input==00) {
    //     System.out.println("Positive:"+positive);
    //     System.out.println("Negative:"+negative);
    //     System.out.println("Zeros:"+zeros);
    //     return;
    //  }
     while(input==11) {
        System.out.println("Enter your no:");
        int number = sc.nextInt();
        if(number>0) {
            positive++;
        } else if(number<0) {
            negative++;
        }  
         else if(input==00) {
            return;
       } else {
        zeros++;
    }
  
   }
   System.out.println("Positive:"+positive);
   System.out.println("Negative:"+negative);
   System.out.println("Zeros:"+zeros);


    
}
