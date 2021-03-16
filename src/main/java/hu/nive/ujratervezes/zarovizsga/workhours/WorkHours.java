package hu.nive.ujratervezes.zarovizsga.workhours;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class WorkHours {
    public String minWork(String file)
    {
        //Path fileother = Path.of(file);

        ArrayList<String> employees = new ArrayList<>();
        try (Scanner s = new Scanner(new File(file)).useDelimiter("\\s*,\\s*")) {
            while (s.hasNext()) {
                employees.add(s.next());
            }
        }
        catch (FileNotFoundException e) {
        }
        for(int i = 1; i < employees.size(); i++)
        {
            System.out.println(employees.get(i));
        }

        int minidx = 1;
        String first,last;
        int    first2,last2;
        for(int i = 1; i < employees.size(); i += 2)
        {
            first = employees.get(minidx);
            last = employees.get(i);
            first2 = parseInt(first);
            last2 = parseInt(last);
            if( first2 > last2)
            {
                minidx = i;
            }
        }
        String teszt3 = employees.get(minidx+1);
        return employees.get((minidx+1));
    }
}
