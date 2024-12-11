
package problem_20;

import java.util.Scanner;


public class Problem_20 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
     //5 > 4
        int n1=input.nextInt();
        char c3=input.next().charAt(0);
        int n2=input.nextInt();
        if(n1>n2&&c3=='>'){
            System.out.println("Right");
        }  
        else if(n1>n2&&c3=='<'){
            System.out.println("Wrong");
        }  
        else if(n1>n2&&c3=='='){
            System.out.println("Wrong");
        }  
          else if(n1<n2&&c3=='<'){
            System.out.println("Right");
        } 
          else if(n1<n2&&c3=='>'){
            System.out.println("Wrong");
        } 
            else if(n1<n2&&c3=='='){
            System.out.println("Wrong");
        } 
          else if(n1==n2&&c3=='='){
            System.out.println("Right");
        } 
           else if(n1==n2&&c3=='<'){
            System.out.println("Wrong");
        } 
           else if(n1==n2&&c3=='>'){
            System.out.println("Wrong");
        } 
        
      
      
    }
    
}
