package hu.nive.ujratervezes.zarovizsga.workhours;
import java.io.*;
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


        ArrayList<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] linePart = line.split(",");
                Employee e = new Employee(linePart[0], Integer.parseInt(linePart[1]), linePart[2]);
                employees.add(e);
            }
        }
        catch (IOException e) {
        }

        int minidx = 0;
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).getHours() < employees.get(minidx).getHours()) {
                minidx = i;
            }
        }
        Employee min = employees.get(minidx);
        return min.getName() + ": " + min.getDate();
    }
}
