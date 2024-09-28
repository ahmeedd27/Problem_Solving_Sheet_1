/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem_12;

import java.util.Scanner;


public class Problem_12 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        String F1=input.next();
        String S1=input.next();
        String F2=input.next();
        String S2=input.next();
        if(S1.equals(S2)){
            System.out.println("ARE Brothers");
            
        }
        else{
            System.out.println("NOT");
        }
        
        
    }
    
}
