package medium;

public class IntegertoRoman {
    public String intToRoman(int num) {
        String ret = "";
        int moc;

        moc = num / 1000;
        num = num % 1000;
        if (moc > 0) {
            for (int i = 0; i < moc; i++) {
                ret += "M";
            }
        }
        if (num >= 900) {
            ret += "CM";
            num -= 900;
        }

        moc = num / 500;
        num = num % 500;
        if (moc > 0) {
            for (int i = 0; i < moc; i++) {
                ret += "D";
            }
        }
        if (num >= 400) {
            ret += "CD";
            num -= 400;
        }

        moc = num / 100;
        num = num % 100;
        if (moc > 0) {
            for (int i = 0; i < moc; i++) {
                ret += "C";
            }
        }
        if (num >= 90) {
            ret += "XC";
            num -= 90;
        }


        moc = num / 50;
        num = num % 50;
        if (moc > 0) {
            for (int i = 0; i < moc; i++) {
                ret += "L";
            }
        }
        if (num >= 40) {
            ret += "XL";
            num -= 40;
        }

        moc = num / 10;
        num = num % 10;
        if (moc > 0) {
            for (int i = 0; i < moc; i++) {
                ret += "X";
            }
        }
        if (num >= 9) {
            ret += "IX";
            num -= 9;
        }

        moc = num / 5;
        num = num % 5;
        if (moc > 0) {
            for (int i = 0; i < moc; i++) {
                ret += "V";
            }
        }
        if (num >= 4) {
            ret += "IV";
            num -= 4;
        }

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                ret += "I";
            }
        }

        return ret;
    }
}


