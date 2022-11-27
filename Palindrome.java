import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(" Enter a string to check it's a palindrome or not:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        isPalindrome(str);
        scan.close();
    }

    // Solution 1 with StringBuilder
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.reverse().toString().equals(str)) {
            System.out.println("\" "+ str +" \""+"  \nis a Palindrome");
            return true;
        }else
        System.out.println( str +"  is NOT a Palindrome");
        return false;
    }

    public static boolean isPalindromeLoop(String str) {
        int head = 0;
        int tail = str.length() - 1;
        while (head < tail) {
            if (str.charAt(head) != str.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true; }
}
