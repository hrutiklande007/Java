public class CmdArg {
    public static void main(String[] args) {
        String[] str = { "Hrutik", "Nikhil" };

        System.out.println(System.identityHashCode(str[0]));
        System.out.println(System.identityHashCode(str[1]));

        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(System.identityHashCode(args[0]));
        System.out.println(System.identityHashCode(args[1]));
    }

}
