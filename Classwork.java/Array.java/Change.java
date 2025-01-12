public class Change {
    static void gun(int xarr[]) {
        for (int y : xarr) {
            System.out.println(y);
        }
        for (int i = 0; i < xarr.length; i++) {
            xarr[i] = xarr[i] + 50;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 50, 100, 150 };

        gun(arr);

        for (int x : arr) {
            System.out.println(x);
        }

    }
}
