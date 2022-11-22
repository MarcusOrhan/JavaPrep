public class Fibonacci {

        public static void main(String[] args) {

            int a=0;
            int b=1;

            System.out.println(a + "  "+b +" ");

            for (int i=2; i<=10; i++){
                //to eliminate 0+1 starting from 2

                int c= a+b;

                a=b;

                b=c;

                System.out.println("c = " + c);
            }
        }
}
