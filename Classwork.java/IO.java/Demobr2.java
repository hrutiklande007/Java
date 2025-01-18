import java.io.*;

public class Demobr2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Building Name:");
        String name = br1.readLine();

        br1.close();

        System.out.println("Enter Building Name:");
        String name1 = br2.readLine();

        System.out.println(name);
        System.out.println(name1);
    }
}
