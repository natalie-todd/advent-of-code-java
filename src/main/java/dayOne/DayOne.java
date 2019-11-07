package dayOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DayOne {

    public static Integer resultingFrequency(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<Integer> frequenciesRead = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            frequenciesRead.add(Integer.parseInt(line));
        }
        br.close();
        fr.close();

        Integer totalFrequency = frequenciesRead.stream().collect(Collectors.summingInt(Integer::intValue));

        return totalFrequency;
    }
}
