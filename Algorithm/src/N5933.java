import java.util.Scanner;

public class N5933 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int width = scnr.nextInt();

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print((i + 1) * (j + 1) + " ");
            }
            System.out.println();
        }

        scnr.close();
    }
}
