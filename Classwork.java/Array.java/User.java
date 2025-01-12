import java.io.*;

public class User {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];
        System.out.println("Enter the numbers:");

        for (int j = 0; j < 5; j++) {

            arr[j] = Integer.parseInt(br.readLine());
        }
        System.out.println("Output: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

}
