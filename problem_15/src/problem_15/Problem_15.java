
package problem_15;

import java.util.Scanner;


public class Problem_15 {

    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
   
       String expr=input.next();
       char op=' ';
       int mid=0;
       for(int i=0 ; i<expr.length();i++){
           if(expr.charAt(i)=='+' || expr.charAt(i)=='-' || expr.charAt(i)=='*' || expr.charAt(i)=='/'){
               op=expr.charAt(i);
               mid=i;
           }
       }
       switch(op){
           case '+':System.out.println(Integer.parseInt(expr.substring(0,mid)) + Integer.parseInt(expr.substring(mid+1)));
           break;
           case '-':System.out.println(Integer.parseInt(expr.substring(0,mid)) - Integer.parseInt(expr.substring(mid+1)));
           break;
           case '*':System.out.println(Integer.parseInt(expr.substring(0,mid)) * Integer.parseInt(expr.substring(mid+1)));
           break;
           case '/':System.out.println(Integer.parseInt(expr.substring(0,mid)) / Integer.parseInt(expr.substring(mid+1)));
           break;
       }
       
    
  }
    
}

