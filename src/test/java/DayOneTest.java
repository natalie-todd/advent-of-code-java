import dayOne.DayOne;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

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
}
