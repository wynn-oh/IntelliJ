import java.util.Scanner;

public class N1307 {
    public static void main(String[] args) {
        char ch = (char)65; // A

        Scanner scnr = new Scanner(System.in);

        int width = scnr.nextInt();

        for(int i = 0; i < width; i++) {
            for(int j = 0; j < width; j++) {
//                ch += (char)((width * (width - j) - i) % 26);
//                System.out.print(width * (width - j) - i + " ");
                System.out.print((char)(ch + ((width * (width - j) - i)-1) % 26) + " ");
            }
            System.out.println();
        }
    }
}
