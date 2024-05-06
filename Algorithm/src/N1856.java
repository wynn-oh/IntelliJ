import java.util.Scanner;

public class N1856 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int height = scnr.nextInt();
        int width = scnr.nextInt();

        int trgNum = 1;

        for(int ropHgh = 0; ropHgh < height; ropHgh++) {
            for(int ropWdh = 0; ropWdh < width; ropWdh++) {
                if(ropHgh % 2 == 0) {
                    // (odd) increse
                    System.out.print(trgNum + " ");

                    trgNum++;

                } else {
                    // (even) reverse
                    if(ropWdh == 0) {
                        trgNum = trgNum + width - 1;
                    }

                    System.out.print(trgNum + " ");

                    trgNum--;

                    if(ropWdh == width - 1) {
                        trgNum = width * (ropHgh + 1) + 1;
                    }
                }
            }

            System.out.println();
        }

        scnr.close();

    }
}
