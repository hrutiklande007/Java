
public class Temprature {
    public static void main(String[] args) {
        float T1 = 98.4f;

        if (T1 > 98.6f) {
            System.out.println("High");
        } else if (T1 < 98.0f) {
            System.out.println("Low");

        } else {
            System.out.println("Normal");
        }
    }

}
