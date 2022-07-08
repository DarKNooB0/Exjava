package Ex5;

import sun.print.SunMinMaxPage;

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Random di = new Random();
        int dice1 = di.nextInt(6);
        int dice2 = di.nextInt(6);
        int dice3 = di.nextInt(6);
        System.out.printf("เต๋าลูกที่1 :%01d\n",dice1);
        System.out.printf("เต๋าลูกที่2 :%01d\n",dice2);
        System.out.printf("เต๋าลูกที่3 :%01d\n",dice3);
        int sumDice = dice1+dice2+dice3;
        System.out.println("ผลรวมของเต๋า: "+sumDice);
        if (sumDice < 11){
            System.out.println("Low");
        } else if (sumDice > 11) {
            System.out.println("High");
        }else {
            System.out.println("Eleven");
        }

    }
}
