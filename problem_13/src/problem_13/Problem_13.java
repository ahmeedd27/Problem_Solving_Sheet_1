/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem_13;

import java.util.Scanner;


public class Problem_13 {

  static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        char N=input.next().charAt(0);
        if(N>=48&&N<=57){
            System.out.println("IS DIGIT");
        }
        else if(N>=65&&N<=90){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
        else if(N>=97&&N<=122){
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
                  
    }
}
