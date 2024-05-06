import java.util.Scanner;

public class N1303 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int prmtr1 = scnr.nextInt();
        int prmtr2 = scnr.nextInt();

        int trgNum = 1;

        for(int i = 0; i < prmtr1; i++) {
            for(int j = 0; j < prmtr2; j++) {
                System.out.print(trgNum + " ");

                trgNum++;
            }

            System.out.println();
        }

        scnr.close();
    }

}
