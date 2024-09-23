
package problem_3;

import java.util.Scanner;


public class Problem_3 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        long num1=input.nextInt();
        long num2=input.nextInt();
        long sum=num1+num2;
        long mul=num1*num2;
        long sub=num1-num2;
        System.out.println(num1+" "+"+"+" "+num2+" "+"="+" "+sum);
        System.out.println(num1+" "+"*"+" "+num2+" "+"="+" "+mul);
        System.out.println(num1+" "+"-"+" "+num2+" "+"="+" "+sub);
        
    }
    
}
