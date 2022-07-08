package Ex4;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num2 = rd.nextInt(100);
        System.out.printf("รางวัลเลขท้าย2ตัวคือ: %02d\n",num2);

        Random rd2 = new Random();
        int num3 = rd2.nextInt(1000);
        System.out.print("รางวัลเลขท้าย3ตัวคือ"+ num3);

    }
}
