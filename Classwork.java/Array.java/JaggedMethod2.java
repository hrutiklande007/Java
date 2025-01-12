public class JaggedMethod2 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 7 } };

        int arr2[][] = new int[3][];

        arr2[0] = new int[] { 1, 2, 3 };
        arr2[1] = new int[] { 4, 5 };
        arr2[2] = new int[] { 7 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

    }

}
