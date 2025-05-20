package by.it_academy.jd2.Mk_JD2_111_25.HW1;

public class Double2String {

    public static String toString(double number) {

        int intNum = (int) number;

        StringBuilder numStr = new StringBuilder();

        if (intNum < 0) {
            intNum = intNum * -1;
            numStr.append("минус ");
        }

        if (intNum == 0) {
            numStr.append("ноль ");
        }

        int[] groupArr = new int[]{intNum / 1000000, intNum / 1000 % 1000, intNum % 1000};

        String[] millArr = new String[]{"миллионов", "миллион", "миллиона", "миллиона", "миллиона", "миллионов", "миллионов", "миллионов", "миллионов", "миллионов"};
        String[] thouArr = new String[]{"тысяч", "тысяча", "тысячи", "тысячи", "тысячи", "тысяч", "тысяч", "тысяч", "тысяч", "тысяч"};
        String[] hundArr = new String[]{"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] tenArr = new String[]{"десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] teenArr = new String[]{"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] unitArrm = new String[]{"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] unitArrf = new String[]{"одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        for (int i = 0; i < groupArr.length; i++) {
            int h = groupArr[i] / 100;
            int d = groupArr[i] / 10 % 10;
            int u = groupArr[i] % 10;

            if (h > 0) {
                numStr.append(hundArr[h - 1]);
                numStr.append(" ");
            }
            if (d > 0) {
                if (d > 1) {
                    numStr.append(tenArr[d - 1]);
                    numStr.append(" ");
                }
                if (d == 1) {
                    numStr.append(teenArr[u]);
                    numStr.append(" ");
                }
            }
            if (u > 0 && d != 1) {
                if (i == 1 || number % 1 > 0) {
                    numStr.append(unitArrf[u - 1]);
                    numStr.append(" ");
                } else {
                    numStr.append(unitArrm[u - 1]);
                    numStr.append(" ");
                }
            }
            if (i == 1 && groupArr[i] > 0) {
                numStr.append(thouArr[u]);
                numStr.append(" ");
            }
            if (i == 0 && groupArr[i] > 0) {
                numStr.append(millArr[u]);
                numStr.append(" ");
            }
        }
        if (number % 1 != 0) {
            numStr.append((groupArr[(groupArr.length - 1)] % 10) == 1 ? "целая " : "целых ");

            String partStr = Double.toString(number);
            String[] parts = partStr.split("\\.");
            int pd = Integer.parseInt(parts[1].substring(0, 1));
            int ph = 0;
            if (parts[1].length() > 1) {
                ph = Integer.parseInt(parts[1].substring(1, 2));
            }

            if (ph > 0) {
                if (pd > 1) {
                    numStr.append(tenArr[pd - 1]);
                    numStr.append(" ");
                }
                if (pd == 1) {
                    numStr.append(teenArr[ph]);
                    numStr.append(" ");
                }
            }
            if (ph == 0) {
                if (pd == 1) {
                    numStr.append(unitArrf[pd - 1]);
                    numStr.append(" ");
                } else {
                    numStr.append(unitArrm[pd - 1]);
                    numStr.append(" ");
                }
            }
            if (ph > 0 && pd != 1) {
                numStr.append(unitArrf[ph - 1]);
                numStr.append(" ");
            }

            if (ph != 0) {
                numStr.append(ph == 1 ? "сотая " : "сотых ");
            } else {
                numStr.append(pd == 1 ? "десятая " : "десятых ");
            }
        }
        numStr.setCharAt(0, Character.toUpperCase(numStr.charAt(0)));

        return numStr.toString().trim();
    }

}

