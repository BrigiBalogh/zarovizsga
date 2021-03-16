package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {


    public int getCountOfDigits(String s) {
        if (s == null || notNumber(s) || s == "" || s.length() == 1) {
            throw new IllegalArgumentException(" The data is invalid");
        }

        List<Character> digits = new ArrayList<>();


        int count = 0;
        for (char c : s.toCharArray()) {
            if (!digits.contains(c + "")) {
                count++;
                digits.add(c);
            }
        }
        return count;
    }
     /*  char[] c = s.toCharArray();
        for(int i =0; (c.length-1)>i;i++)
        {
            for(int j=i+1;c.length >j;j++)
            {
                if(c[i] > c[j])
                {
                    char help = c[i];
                    c[i] = c[j];
                    c[j] =help;
                }
            }
        }
        int count = 1;
        int index = 0;
        for(int i =0;c.length-1>i;)
        {
            for(int j=i+1;c.length >j;j++)
                if (c[i] != c[j]) {
                    index = j;
                    count++;
                    break;
                }
            i = index;
        }
        return count;
    }*/



    private boolean notNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return true;
            }
        }
        return false;
    }
}
