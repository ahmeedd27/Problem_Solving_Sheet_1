
package problem_f;

import java.util.Scanner;


public class Problem_F {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        long n=input.nextLong();
        long m=input.nextLong();
        String num=String.valueOf(n);
         String mum=String.valueOf(m);
         char c1=num.charAt(num.length()-1);
         char c2=mum.charAt(mum.length()-1);
        
         int re=Character.getNumericValue(c1)+Character.getNumericValue(c2);
         System.out.println(re);
        /*
         another solution with mod
         long n=input.nextLong();
          long m=input.nextLong();
         int lastn=n%10;
         int lastm=m%10;
         sout(lastn+lastm);
         
         
         */
    }
    
}
