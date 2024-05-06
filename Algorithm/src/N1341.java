import java.util.Scanner;

public class N1341 {
    public static void main(String[] args) throws Exception {
//        System.out.println(padding("l", "", " ", 3));

        Scanner scnr = new Scanner(System.in);

        int prmtr1 = scnr.nextInt();
        int prmtr2 = scnr.nextInt();

        int rpCnt = Math.abs(prmtr1 - prmtr2);

        int trgNum = prmtr1;

        for(int i = 0; i <= rpCnt; i++) {

            int j = 0;
            while (j < 9) {
                j++;
                System.out.print(trgNum + " * " + j  + " = "+ padding("l", "" + trgNum * j, " ", 2));

                if(j % 3 != 0) {
                    System.out.print(padding("l", "", " ", 3));
                } else {
                    System.out.println();
                }

            }
            if(prmtr1 > prmtr2) {trgNum--;}
            else                {trgNum++;}

            System.out.println("\n");
        }

        scnr.close();
    }

    private static String padding(String padDir, String trgStr, String padStr, int reptCnt) throws Exception{

        // check validation
        // 1. null
        if(padDir.isEmpty() || padStr.isEmpty() || reptCnt == 0) {
            throw new Exception("필수값은 널이 될수 없습니다.");
        }

        // 2. padding direction (left or right)
        if(!"l".equals(padDir) && !"r".equals(padDir)) {
            throw new Exception("패딩 방향은 l(왼쪽) 또는 r(오른쪽)만 가능합니다.");
        }

        // 3. trgStr length cannot be longer than reptCnt
        if(trgStr.length() > reptCnt) {
            return trgStr;
        }

        // 4. padStr length cannot be larger than 1
        if(padStr.length() > 1) {
            throw new Exception("패딩문자의 길이는 1보다 클 수 없습니다.");
        }

        // roop Start
        String rsltStr = trgStr;

        for(int i = 0; i < reptCnt - trgStr.length(); i++) {
            if("l".equals(padDir)) {
                rsltStr = padStr + rsltStr;
            }
            else if ("r".equals(padDir)) {
                rsltStr += padStr;
            }
        }

        return rsltStr;
    }
}

