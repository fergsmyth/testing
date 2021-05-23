
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormaliserTest {

    @Test
    public void normaliseLatinCharacters() {
        Normaliser normaliser = new Normaliser();
        String normalised = normaliser.normalise("i");
        assertEquals("i", normalised);
    }

    @Test
    public void normaliseAccentedCharacters() {
        Normaliser normaliser = new Normaliser();
        String normalised = normaliser.normalise("orčpžsíáýd");
        assertEquals("i", normalised);
    }

}
