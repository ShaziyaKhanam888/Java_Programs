
/* Sum of Natural Numbers
* Write a program to calculate the sum of the first n natural numbers,
* where n is provided by the user.
*/
package practice;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();

    }

}
