import java.io.*;

public class Avg {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Player Name:");
        String name = br.readLine();

        System.out.println("Enter JerNo:");
        int jer = Integer.parseInt(br.readLine());

        System.out.println("Enter Ang:");
        Float avg = Float.parseFloat(br.readLine());

        System.out.println(name);
        System.out.println(jer);
        System.out.println(avg);

    }

}
