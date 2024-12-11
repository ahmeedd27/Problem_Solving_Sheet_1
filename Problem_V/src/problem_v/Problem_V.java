
package problem_v;

import java.util.Scanner;


public class Problem_V {

    
    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        char c=input.next().charAt(0);
        int y=input.nextInt();
        if(x>y&&c=='>'){
            System.out.println("Right");
        }
        else if(x==y&&c=='<'){
            System.out.println("Wrong");
        }
        else if(x==y&&c=='>'){
            System.out.println("Wrong");
        }
        else if(x>y&&c=='<'){
            System.out.println("Wrong");
        }
         else if(y>x&&c=='<'){
            System.out.println("Right");
        }
         else if(y>x&&c=='>'){
            System.out.println("Wrong");
        }
         else if(x==y&&c=='='){
             System.out.println("Right");
         }
         else if(x!=y&&c=='='){
             System.out.println("Wrong");
         }
        
        
    }
    
}
