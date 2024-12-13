package problem_x;

import java.util.Scanner;

public class Problem_X {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n1 = input.nextLong();
        long n2 = input.nextLong();
        long m1 = input.nextLong();
        long m2 = input.nextLong();
        long start=0, end=0;

        if ((n1 > m1 && n1 > m2) || (m1 > n2 && m2 > n2)) {
            System.out.println("-1");
        } else {
            if (n1 > m1) {
                start = n1;
            } else {
                start = m1;
            }
            if (n2 > m2) {
                end = m2;
            } else {
                end = n2;
            }
            System.out.println(start+" "+end);
        }
        

    }
}

//           else if(m1>n1&&m2>n2&&n2>m1){
//               System.out.println(m1+" "+n2);
//           }
//           else if(n1>m1&&n2>m2){
//               System.out.println(n1+" "+m2);
//           }
//           else if(m1>n1&&n2>m2){
//               System.out.println(m1+" "+m2);
//           }
//           else if(n1>m1&&m2>n2){
//               System.out.println(n1+" "+n2);
//           }
//           else if(n1==m1&&n2==m2&&n1==n2&&m1==m2){
//               System.out.println(m1+" "+m2);
//           }
//    }
//    
//}
