public class Armstrong {
    public static void main(String[] args) {
        int n = 35;
        int count = 0;
        int temp1 = n;
        int temp2 = n;
        int sum = 0;

        while (temp1 != 0) {
            count++;
            temp1 = temp1 / 10;
        }

        while (n != 0) {
            int rem = n % 10;
            int mult = 1;

            for (int i = 1; i <= count; i++) {
                mult = mult * rem;

            }
            sum = sum + mult;
            n = n / 10;

        }
        if (temp2 == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

    }

}
