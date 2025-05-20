package by.it_academy.jd2.Mk_DompytheFox_111_25.HW1;

public class Long2HMSM {

    public static String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        int h = (int) (millisecond / 3600000);
        int m = (int) (millisecond % 3600000 / 60000);
        int s = (int) (millisecond % 3600000 % 60000 / 1000);
        int ms = (int) (millisecond % 3600000 % 60000 % 1000);

        StringBuilder resultStr = new StringBuilder();

        if (shortFormat) {
            if (h < 10) {
                resultStr.append("0");
            }
            resultStr.append(h);
            resultStr.append(":");
            if (m < 10) {
                resultStr.append("0");
            }
            resultStr.append(m);
            resultStr.append(":");
            if (s < 10) {
                resultStr.append("0");
            }
            resultStr.append(s);
            resultStr.append(".");
            if (ms < 100) {
                resultStr.append("0");
            }
            if (ms < 10) {
                resultStr.append("0");
            }
            resultStr.append(ms);
        } else {
            resultStr.append(h);
            if (h % 10 == 0 || h % 10 >= 5) {
                resultStr.append(" часов ");
            }
            if (h % 10 >= 2 && h % 10 <= 4) {
                resultStr.append(" часа ");
            }
            if (h % 10 == 1) {
                resultStr.append(" час ");
            }
            resultStr.append(m);
            if (m % 10 == 0 || m % 10 >= 5) {
                resultStr.append(" минут ");
            }
            if (m % 10 >= 2 && m % 10 <= 4) {
                resultStr.append(" минуты ");
            }
            if (m % 10 == 1) {
                resultStr.append(" минута ");
            }
            resultStr.append(s);
            if (s % 10 == 0 || s % 10 >= 5) {
                resultStr.append(" секунд ");
            }
            if (s % 10 >= 2 && s % 10 <= 4) {
                resultStr.append(" секунды ");
            }
            if (s % 10 == 1) {
                resultStr.append(" секунда ");
            }
            resultStr.append(ms);
            if (ms % 10 == 0 || ms % 10 >= 5) {
                resultStr.append(" миллисекунд ");
            }
            if (ms % 10 >= 2 && ms % 10 <= 4) {
                resultStr.append(" миллисекунды ");
            }
            if (ms % 10 == 1) {
                resultStr.append(" миллисекунда ");
            }
        }
        return resultStr.toString();
    }
}
