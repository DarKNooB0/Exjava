package Ex3;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ป้อนชื่อ>> ");
        String fname = sc.next();

        System.out.print("ป้อนอายุ>> ");
        int age = sc.nextInt();

        System.out.print("ป้อนที่อยู่>> ");
        String  address = sc.next();

        System.out.printf("ชื่อ: %s,อายุ: %d,ที่อยู่: %s", fname, age, address);
    }
}
