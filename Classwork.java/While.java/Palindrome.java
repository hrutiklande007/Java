public class Palindrome {
    public static void main(String[] args) {
        int n = 2332;
        int rev = 0;
        int temp = n;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.print(rev);
        if (temp == rev) {
            System.out.println(" is a Palindrome");
        } else {
            System.out.println(" is not a Palindrome");
        }

    }

}
