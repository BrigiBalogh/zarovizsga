package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkHours {
    public String minWork(String file) {
        Path fileother = Path.of(file);
        try {
            List<String> employees = Files.readAllLines(fileother);
            for (String employee: employees) {

            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
