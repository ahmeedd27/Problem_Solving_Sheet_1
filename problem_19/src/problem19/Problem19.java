
package problem19;

import java.math.BigInteger;
import java.util.Scanner;


public class Problem19 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
     BigInteger a=input.nextBigInteger();
     BigInteger b=input.nextBigInteger();
     BigInteger c=input.nextBigInteger();
     BigInteger d=input.nextBigInteger();
     BigInteger re=a.multiply(b).multiply(c).multiply(d);
     BigInteger m=new BigInteger("100");
     re=re.mod(m);
     String s=new String();
     s=re.toString();
     if(s.length()-1==0){
         System.out.println("0"+s);
     }
     else{
         System.out.println(s);
     }
     
        
    }
    
}
