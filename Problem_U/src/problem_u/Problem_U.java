
package problem_u;

import java.util.Scanner;


public class Problem_U {

    
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
        float n=input.nextFloat();
       if(n>0){
            if((n-(int)n)==0){
            System.out.println("int "+(int)n);
        }
        else if((n-(int)n)>0){
            System.out.println("float "+(int)n+" "+(n-(int)n));
        }
       }
    }
    
}
