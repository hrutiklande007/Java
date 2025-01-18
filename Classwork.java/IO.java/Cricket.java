import java.io.*;

public class Cricket {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Name of Batsman: ");
        String name = br.readLine();
        System.out.println("Name : " + name);

        System.out.println("Enter Name of Bowler: ");
        String name1 = br.readLine();
        System.out.println("Name : " + name1);

    }

}
