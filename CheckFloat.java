package test55;

public class CheckFloat {

    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO
    }

    static boolean check(String date) {
        FloatState state = FloatState.START; // 変数の型を明示的に指定
        char[] charArray = date.toCharArray();
        for (char ch : charArray) {
            switch (state) {
                case START:
                    if (ch == '0') {
                        state = FloatState.ZERO;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                    } else {
                        return false;
                    }
                    break;
                case ZERO:
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                    break;
                case INT:
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                    } else if (ch == '.') {
                        state = FloatState.FRAC_START;
                    } else {
                        return false;
                    }
                    break;
                case FRAC_START:
                case FRAC:
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.FRAC;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        switch (state) {
            case ZERO:
            case INT:
            case FRAC:
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check(""));
        System.out.println(check("012"));
        System.out.println(check(".12"));
        System.out.println(check("12."));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("12.30"));
    }
}