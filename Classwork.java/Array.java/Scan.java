import java.util.*;

public class Scan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter the numbers:");

        for (int j = 0; j < 5; j++) {

            arr[j] = sc.nextInt();
        }
        System.out.println("Output: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
