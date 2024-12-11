
package problem_w;

import java.util.Scanner;


public class Problem_W {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        char a=input.next().charAt(0);
        int y=input.nextInt();
        char e=input.next().charAt(0);
        int re=input.nextInt();
        if(a=='+'){
            if((x+y)==re){
                System.out.println("Yes");
            }else{
                System.out.println(x+y);
            }
        }
         if(a=='*'){
            if((x*y)==re){
                System.out.println("Yes");
            }else{
                System.out.println(x*y);
            }
        }
          if(a=='-'){
            if((x-y)==re){
                System.out.println("Yes");
            }else{
                System.out.println(x-y);
            }
        }
        
    }
    
}
