public class Address {

    static void gun(int xarr[]) {
        for (int y : xarr) {
            System.out.println(y);
        }
        xarr[0] = 50;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30 };

        for (int x : arr) {
            System.out.println(x);
        }

        gun(arr);

        for (int x : arr) {
            System.out.println(x);
        }

    }

}
