import java.io.*;

public class Sum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr1[] = new int[5];
        System.out.println("Enter Integers:");

        int sum = 0;
        for (int j = 0; j < 5; j++) {
            arr1[j] = Integer.parseInt(br.readLine());
            sum = sum + arr1[j];
        }
        System.out.println("Sum of output : " + sum);
    }

}
