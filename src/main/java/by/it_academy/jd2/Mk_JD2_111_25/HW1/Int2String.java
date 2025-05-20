package by.it_academy.jd2.Mk_DompytheFox_111_25.HW1;

public class Int2String {

    public static String toString(int number) {

        StringBuilder numStr = new StringBuilder();

        if (number < 0) {
            number = number * -1;
            numStr.append("минус ");
        }

        if (number == 0) {
            numStr.append("ноль");
        }

        int[] groupArr = new int[]{number / 1000000, number / 1000 % 1000, number % 1000};

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
                if (i == 1) {
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
        numStr.setCharAt(0, Character.toUpperCase(numStr.charAt(0)));

        return numStr.toString().trim();
    }

}
