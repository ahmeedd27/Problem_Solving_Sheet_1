
package problem18;

import java.util.Scanner;


public class Problem18 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
   long a=input.nextLong();
   long b=input.nextLong();
   long c=input.nextLong();
   long d=input.nextLong();
   long x=a*b-c*d;
        System.out.println("Difference = " + x);
        
    }
    
}
