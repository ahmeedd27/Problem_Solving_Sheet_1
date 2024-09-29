
package problem_14;

import java.util.Scanner;


public class Problem_14 {

  static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        char N=input.next().charAt(0);
      
         if(N>=65&&N<=90){
             char asc= (char) ((char) N+32);
            System.out.println(asc);
        }
        else if(N>=97&&N<=122){
            char asc= (char) ((char) N-32);
            System.out.println(asc);
        }
        
    }
    
}
