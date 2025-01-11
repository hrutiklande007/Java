
public class Fizz {
    public static void main(String[] args) {
        int x = 11;

        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Fizz-Buzz");
        } else if (x % 5 == 0) {
            System.out.println("Buzz");
        } else if (x % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println("Not divisible by both");
        }
    }

}
