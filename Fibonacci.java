import java.util.Scanner;

public class Fibonacci {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number to print fibonacci numbers");
            int number = scan.nextInt();
            int a=0;
            int b=1;
            System.out.println(a + "  "+b +" ");
            for (int i=2; i<=number; i++){
                //to eliminate 0+1 starting from 2
                int c= a+b;
                a=b;
                b=c;
                System.out.println("fibonacci #" +(i-1)+ " :"+ c);
                scan.close();
            }
        }
}
