import java.util.Scanner;

public class N5932 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int width = scnr.nextInt();

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < width; j++) {
                if(i % 2 == 0) {
                    // odd (increase)
                    System.out.print(j + 1 + " ");
                } else {
                    // even (reverse)
                    System.out.print(width - j + " ");
                }
            }
            System.out.println();
        }

        scnr.close();
    }
}
