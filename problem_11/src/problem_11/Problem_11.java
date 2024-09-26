
package problem_11;

import java.util.Scanner;

public class Problem_11 {

   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int A=input.nextInt();
        int B=input.nextInt();
        int C=input.nextInt();
         int max =A;
         int min =A;
         if(A>=B&&A>=C){
             max=A;
         }
         else if(B>=A&&B>=C){
             max=B;
         }
          else if(C>=A&&C>=B){
             max=C;
         }
         
         
         if(A<=B&&A<=C){
              min=A;
          }
         else if(B<=A&&B<=C){
              min=B;
          }
         else if(C<=B&&C<=A){
              min=C;
          }
         System.out.println(min+" "+max);
        
    }
    
}
