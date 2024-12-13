
package problem_z;

import java.util.Scanner;


public class Problem_Z {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        double num4=input.nextDouble();
      double re1=num2*Math.log(num1);
      double re2=num4*Math.log(num3);
      if(re1>re2){
          System.out.println("YES");
      }else{
          System.out.println("NO");
      }
             
    }
    
}
