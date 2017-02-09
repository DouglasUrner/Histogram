/**
 * Created by dlu on 09.02.2017.
 */
public class Histogram {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 3, 5, 6, 0, 3, 3, 1 };
        //int[] data = { 1, 2, 3};

        printHisto(data);
    }

    public static void printHisto(int[] values) {
        int rows = max(values);

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < values.length; j++) {
                if (values[j] >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int max(int[] set) {
        return 6;
    }

}
