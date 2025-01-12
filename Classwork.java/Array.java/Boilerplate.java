import java.util.*;

public class Boilerplate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("Even count of number:  " + count1);
        System.out.println("Even count of number:  " + count2);

    }

}
