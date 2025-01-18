import java.io.*;

public class Building {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Building Name:");
        String name = br.readLine();

        System.out.println("Enter wing:");
        char wing = (char) br.read();

        br.skip(2);

        System.out.println("Enter FlatNo:");
        int flat = Integer.parseInt(br.readLine());

        System.out.println(name);
        System.out.println(wing);
        System.out.println(flat);
    }

}
