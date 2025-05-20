package by.it_academy.jd2.Mk_JD2_111_25.HW1;

public class Int2Week {

    public static String toString(int day) {

        int weeks = day / 7;
        String weekStr = "";
        if (weeks == 0 || weeks >= 5) {
            weekStr = weeks + " недель";
        }
        if (weeks >= 2 && weeks <= 4) {
            weekStr = weeks + " недели";
        }
        if (weeks == 1) {
            weekStr = weeks + " неделя";
        }
        return weekStr;
    }
}
