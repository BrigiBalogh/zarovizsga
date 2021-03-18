package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {


    public int getCountOfDigits(String s) {
        if (s == null || s.isEmpty() /*|| s.equals("")*/) {
            return 0;
        }

        List<String> digits = new ArrayList<>();


        int count = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9' && !digits.contains(c + "")) {
                count++;
                digits.add(c + "");
            }
        }
        return count;
    }

}
