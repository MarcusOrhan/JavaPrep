public class SwapNumNoTemp {
    public static void main(String[] args) {
        int a = 12, b = 42;
        a = a ^ b ^ (b = a); //method 1
       // b = (a + b) – (a = b); //method 2
       // a += b – (b = a); //method 3
        System.out.println("a: "+a +" - b = " + b );
    }
}
