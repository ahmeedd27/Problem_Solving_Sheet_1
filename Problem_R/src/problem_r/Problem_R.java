
package problem_r;

import java.util.Scanner;


public class Problem_R {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int m=0,d=0;
        int month=0;
        int year=num/365;
        if(year>=1){
            m=num-year*365;
            if(m>=1){
                month=m/30;
                d=m-month*30;
            }
        }
        else{
            year=0;
            month=num/30;
            d=num-month*30;
        }
          System.out.println(year+" years");
          System.out.println(month+" months");
          System.out.println(d+" days");
      
      
      

    }
    
}
