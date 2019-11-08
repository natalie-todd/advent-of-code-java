package dayOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DayOne {

    public static List<Integer> tempTotalList(String fileName) throws IOException {
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

        resultingFrequency(tempTotalList);
        firstDouble(tempTotalList);

        return tempTotalList;
    }

    public static Integer resultingFrequency(List<Integer> tempTotalList) {

        Integer totalFrequency = tempTotalList.get(tempTotalList.size() - 1);

        return totalFrequency;
    }

    public static Integer firstDouble(List<Integer> frequencies) {
        Integer firstDuplicateFrequency = frequencies.stream()
                .filter(freq -> Collections.frequency(frequencies, freq) > 1)
                .findFirst()
                .orElse(null);

        return firstDuplicateFrequency;
        }

    public static void main(String[] args) throws IOException {
        System.out.println(firstDouble(tempTotalList("src/main/java/dayOne/dayOneInput.txt")));
    }
}
