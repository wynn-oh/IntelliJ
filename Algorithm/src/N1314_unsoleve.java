import java.util.Scanner;

public class N1314_unsoleve {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int width = scnr.nextInt();

        int oddNum = 1;
        int evenNum = width * 2;

        for(int i = 1; i <= width; i++) {
            for(int j = 1; j <= width; j++) {
                if(j % 2 != 0) {
                    // odd
                } else {
                    // even
                }
            }
            System.out.println();
        }

        scnr.close();
    }
}
