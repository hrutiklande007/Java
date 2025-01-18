import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = obj1.next();

        System.out.println("Enter your age: ");
        int age = obj1.nextInt();

        System.out.println(name);
        System.out.println(age);

    }

}
