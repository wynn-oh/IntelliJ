import java.util.Scanner;

public class N1304 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int width = scnr.nextInt();

        for (int i = 0; i < width; i++) {
            for( int j = 0; j < width; j++) {
                System.out.print((i+1) + (width * j) + " ");
            }

            System.out.println();
        }

        scnr.close();
    }
}
