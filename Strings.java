import java.util.*;
public class Strings {
    //Strings are immutable means we can't change,modify or delete a string once it declared.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //1.Concatenation
        String firstName = "Shaziya";
        String lastName = "Khanam";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //2.length
        System.out.println(fullName.length());
        
        //3.CharAt-> ek ek index p ja k character print krte.
        // for(int i=0;i<fullName.length();i++) {
        //     System.out.println(fullName.charAt(i));

        //4.Compare->
          // 1.s1>s2 -> +ve value
          // 2.s1==s2-> 0
          //3. s1<s2-> -ve value

          if(firstName.compareTo(lastName)==0) {
            System.out.println("Strings are equal");
          } else {
            System.out.println("Strings are not equal");
          }

    //This method can also work in some situation but not valid to use for string's comparison.
         //   if(firstName==lastName) {
        //     System.out.println("Strings are equal");
        //   } else {
        //     System.out.println("Strings are not equal");
        //   }
        //   if(new String("Bushu") == new String("Bushu")) {
        //     System.out.println("Strings are equal");
        //   } else {
        //     System.out.println("Strings are not equal");
        //   }

        //5.sub string->(beginning index,ending index)
        System.out.println(fullName.substring(8,fullName.length()));

        }
    }
    

