public class Jagged {
    public static void main(String[] args) {

        int arr1[][] = new int[3][3];

        int arr2[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
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
