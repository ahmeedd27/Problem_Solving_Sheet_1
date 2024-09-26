/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem_8;

import static java.lang.Math.*;
import java.util.Scanner;


public class Problem_8 {

    static Scanner n=new Scanner(System.in);
    public static void main(String[] args) {
        int A=n.nextInt();
      int B=n.nextInt();
        float re=(float)A/(float)B;
        int r1=(int) floor(re);
        int r2=(int) ceil(re);
        int r3=(int) round(re);
        System.out.println("floor "+A+" "+"/"+" "+B+" "+"="+" "+r1);
        System.out.println("ceil "+A+" "+"/"+" "+B+" "+"="+" "+r2);
        System.out.println("round "+A+" "+"/"+" "+B+" "+"="+" "+r3);
    }
    
}
