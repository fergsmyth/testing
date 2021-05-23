
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormaliserTest {

    @Test
    public void normaliseUmlaut() {
        Normaliser normaliser = new Normaliser();
        String normalised = normaliser.normalise("ä ö ü");
        assertEquals("a o u", normalised);
    }

}
