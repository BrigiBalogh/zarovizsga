package hu.nive.ujratervezes.zarovizsga;

public class DigitsCounter {


    public int getCountOfDigits(String s) {
        if (s.isEmpty() || s == null || notNumber(s)) {
            throw new IllegalArgumentException(" The data is invalid");
        }

    }




    private boolean notNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return true;
            }
        }
        return false;
    }
}
