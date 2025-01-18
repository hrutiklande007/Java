import java.io.*;

public class Demoinput {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter char");
        char ch = (char) isr.read();

        System.out.println(ch);
    }

}
