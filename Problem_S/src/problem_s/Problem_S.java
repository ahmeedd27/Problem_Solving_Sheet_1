
package problem_s;

import java.util.Scanner;


public class Problem_S {

   
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        float num=input.nextFloat();
       if(num>=0.0000 &&num<=25.0000){
           System.out.println("Interval [0,25]");
       }
       else if(num>=25.0000 &&num<=50.0000){
            System.out.println("Interval (25,50]");
       }
        else if(num>=50.0000 &&num<=75.0000){
            System.out.println("Interval (50,75]");
       }
        else if(num>=75.0000 &&num<=100.0000){
            System.out.println("Interval (75,100]");
       }
        else{
            System.out.println("Out of Intervals");
        }
    }
    
}
