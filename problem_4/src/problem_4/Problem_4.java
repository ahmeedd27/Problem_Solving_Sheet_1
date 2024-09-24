/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem_4;

import java.util.Scanner;

/**
 *
 * @author computop
 */
public class Problem_4 {

   static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        long A=input.nextLong();
        long B=input.nextLong();
        long C=input.nextLong();
        long D=input.nextLong();
        long X=(A*B)-(C*D);
        System.out.println("Difference = "+X);
    }
    
}
