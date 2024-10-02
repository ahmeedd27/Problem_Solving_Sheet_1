
package problem_17;

import java.util.Scanner;


public class Problem_17 {

  static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        
        float n1=input.nextFloat();
        float n2=input.nextFloat();
        if(n1>0 && n2<0){
            System.out.println("Q4");
        }
        else if(n1>0 && n2>0){
            System.out.println("Q1");
        }
         else if(n1<0 && n2>0){
            System.out.println("Q2");
        }
         else if(n1<0 && n2<0){
            System.out.println("Q3");
        }
         else if(n1==0 && n2==0){
            System.out.println("Origem");
        }
         else if(n1>0 && n2==0){
            System.out.println("Eixo X");
        }
         else if(n1==0 && n2>0){
            System.out.println("Eixo Y");
        }
    }
    
}
