import java.io.*;
import java.util.*;

public class IPL {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Match,MOM,Runs");
        String info = br.readLine();

        System.out.println(info);

        StringTokenizer obj = new StringTokenizer(info, ",");

        String token1 = obj.nextToken();
        String token2 = obj.nextToken();
        String token3 = obj.nextToken();

        System.out.println("Match: " + token1);
        System.out.println("MOM: " + token2);
        System.out.println("Runs: " + token3);

    }

}
