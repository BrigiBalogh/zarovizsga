package hu.nive.ujratervezes.zarovizsga.digitscounter;

public class DigitsCounter {


    public int getCountOfDigits(String s) {
        if (s.isEmpty() || s == null || notNumber(s)) {
            throw new IllegalArgumentException(" The data is invalid");
        }
        char[] c = s.toCharArray();
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
