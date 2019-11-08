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

        List<Integer> tempTotalList = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            frequenciesRead.add(Integer.parseInt(line));
            Integer tempTotal = frequenciesRead.stream().collect(Collectors.summingInt(Integer::intValue));
            tempTotalList.add(tempTotal);
        }
        br.close();
        fr.close();

        firstDouble(tempTotalList);

        Integer totalFrequency = frequenciesRead.stream().collect(Collectors.summingInt(Integer::intValue));

        return totalFrequency;
    }

    public static Integer firstDouble(List<Integer> frequencies) {
        return null;
    }
}
