public class Argument {
    public static void main(String[] args) {
        Argument obj = new Argument();
        int ret = obj.fun(10);
        System.out.println(ret);
    }

    int fun(int x) {
        int val = x + 50;
        return val;
    }

}
