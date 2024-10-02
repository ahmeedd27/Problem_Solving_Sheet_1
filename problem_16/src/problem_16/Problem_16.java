
package problem_16;

import java.util.Scanner;


public class Problem_16 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        
        String num=input.next();
        char n=' ';
        n=num.charAt(0);
         int nn= Integer.parseInt(String.valueOf(n));
         if(n%2==0){
             System.out.println("EVEN");
         }
         else if(n%2!=0){
             System.out.println("ODD");
         }
       
        
       
    }
    
}
