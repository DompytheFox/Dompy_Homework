package by.it_academy.jd2.Mk_DompytheFox_111_25.HW1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите целое число от -999 999 999 до 999 999 999:");
        Scanner sc1 = new Scanner(System.in);
        System.out.println(Int2String.toString(sc1.nextInt()));

        System.out.println("Введите дробное число от -999 999 999 до 999 999 999:");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(Double2String.toString(sc2.nextDouble()));

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int day = Integer.parseInt(sc3.nextLine());
        System.out.println(Int2Week.toString(day));

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Введите количество миллисекунд:");
        long millisStr = sc4.nextLong();
        System.out.println("Выберите формат: короткий (true) или длинный (false):");
        boolean formatStr = sc4.nextBoolean();
        System.out.println(Long2HMSM.toHoursMinuteSecondMillisecond(millisStr, formatStr));
    }


}
