import dayOne.DayOne;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class DayOneTest {

    private DayOne dayOne;

    @Before
    public void setUp() {
        dayOne = new DayOne();
    }

    @Test
    public void tempTotalList_returnsAllTempFrequencyTotals() throws IOException {
        String firstExample = "src/main/java/dayOne/dayOneTxtOne.txt";

        dayOne = new DayOne();

        List<Integer> actual = dayOne.tempTotalList(firstExample);

        assertThat(actual, equalTo(asList(1, 2, 3)));
    }

    @Test
    public void resultingFrequency_addsAllFrequencies() throws IOException {
        List<Integer> firstExample = new ArrayList<>();
        firstExample.add(1);
        firstExample.add(2);
        firstExample.add(3);

        dayOne = new DayOne();

        Integer actual = dayOne.resultingFrequency(firstExample);

        assertThat(actual, equalTo(3));
    }

    @Test
    public void resultingFrequency_addsAllFrequencies_fromFile() throws IOException {
        String thirdExample = "src/main/java/dayOne/dayOneInput.txt";

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.resultingFrequency(dayOne.tempTotalList(thirdExample));

        assertThat(actual, equalTo(582));
    }

    @Test
    public void firstDouble_returnsFirstDuplicateOfListOfFrequencies_whenRunningThroughListMultipleTimes() throws IOException {
        String input = "src/main/java/dayOne/dayOneFour.txt";

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.firstDouble(input);

        assertThat(actual, equalTo(10));
    }

    @Test
    public void firstDouble_returnsFirstDuplicateOfListOfFrequenciesForInput() throws IOException {
        String input = "src/main/java/dayOne/dayOneInput.txt";

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.firstDouble(input);

        assertThat(actual, equalTo(488));
    }
}
