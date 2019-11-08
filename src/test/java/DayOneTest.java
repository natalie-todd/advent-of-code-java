import dayOne.DayOne;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public void resultingFrequency_addsAllFrequencies() throws IOException {
        String firstExample = "src/main/java/dayOne/dayOneTxtOne.txt";

        dayOne = new DayOne();

        Integer actual = dayOne.resultingFrequency(firstExample);

        assertThat(actual, equalTo(3));
    }

    @Test
    public void resultingFrequency_addsAllFrequencies_whenPositiveAndNegativeValuesAreInput() throws IOException {
        String secondExample = "src/main/java/dayOne/dayOneTxtTwo.txt";

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.resultingFrequency(secondExample);

        assertThat(actual, equalTo(0));
    }

    @Test
    public void resultingFrequency_addsAllFrequencies_whenOnlyNegativeValuesAreInput() throws IOException {
        String thirdExample = "src/main/java/dayOne/dayOneTxtThree.txt";

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.resultingFrequency(thirdExample);

        assertThat(actual, equalTo(-6));
    }

    @Test
    public void resultingFrequency_addsAllFrequencies_fromFile() throws IOException {
        String thirdExample = "src/main/java/dayOne/dayOneInput.txt";

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.resultingFrequency(thirdExample);

        assertThat(actual, equalTo(582));
    }

    @Test
    public void firstDouble_returnsFirstDuplicateOfListOfFrequencies() throws IOException {
        List<Integer> tempTotalList = new ArrayList<>();

        tempTotalList.add(1);
        tempTotalList.add(-1);
        tempTotalList.add(2);
        tempTotalList.add(3);
        tempTotalList.add(4);
        tempTotalList.add(2);

        dayOne = new dayOne.DayOne();

        Integer actual = dayOne.firstDouble(tempTotalList);

        assertThat(actual, equalTo(2));
    }
}
