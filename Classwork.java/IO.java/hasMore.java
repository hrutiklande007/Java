import java.util.*;

public class hasMore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Player Name: ");
        String name = sc.nextLine();

        StringTokenizer st = new StringTokenizer(name, " ");

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }

}
