public class Product {
    public static void main(String[] args) {

        int n = 135;
        int mult = 1;

        while (n != 1) {
            int rem = n % 10;
            mult = mult * rem;

            n = n / 10;

        }
        System.out.println(mult);
    }

}
