
package problem_6;

import java.util.Scanner;


public class Problem_6 {

   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        long N=input.nextLong();
        long M=input.nextLong();
        String fn=Long.toString(N);
        long[] n1=new long[fn.length()];
        long fn1=n1[fn.length()-1];
        String sn=Long.toString(M);
        long[] n2=new long[fn.length()];
        long sn2=n2[sn.length()-1];
        System.out.println(fn1+sn2);
        
        
    }
    
}
