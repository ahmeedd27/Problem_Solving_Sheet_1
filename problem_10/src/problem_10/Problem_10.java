
package problem_10;

import java.util.Scanner;


public class Problem_10 {

   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        long A=input.nextLong();
        long B=input.nextLong();
        if(A%B==0||B%A==0){
            System.out.println("Multiples");
        }
        else{
            System.out.println("No Multiples");
        }
        
    }
    
}
